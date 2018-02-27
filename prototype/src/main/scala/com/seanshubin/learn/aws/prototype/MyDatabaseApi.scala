package com.seanshubin.learn.aws.prototype

import java.util.concurrent.TimeUnit

import akka.actor.ActorSystem
import com.amazonaws.services.rds.AmazonRDSAsyncClientBuilder
import com.amazonaws.services.rds.model.{CreateDBInstanceRequest, DeleteDBInstanceRequest, DescribeDBInstancesRequest}

import scala.collection.JavaConverters._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.{Duration, _}
import scala.concurrent.{Await, Promise}

class MyDatabaseApi {
  private val client = AmazonRDSAsyncClientBuilder.defaultClient()
  private val actorSystem = ActorSystem("MyDatabaseApi")

  def createDatabase(instanceIdentifier: String): Unit = {
    val createDbInstanceRequest = new CreateDBInstanceRequest().
      withMasterUserPassword("square-tree").
      withDBInstanceIdentifier(instanceIdentifier).
      withEngine("mysql").
      withDBInstanceClass("db.t2.micro").
      withMasterUsername("sean").
      withAllocatedStorage(20)
    client.createDBInstance(createDbInstanceRequest)
  }

  def databaseExists(instanceIdentifier: String): Boolean = {
    val describeDbInstancesRequest = new DescribeDBInstancesRequest()
    val describeDbInstancesResponse = client.describeDBInstances(describeDbInstancesRequest)
    val dbInstances = describeDbInstancesResponse.getDBInstances.asScala
    dbInstances.exists(dbInstance => dbInstance.getDBInstanceIdentifier == instanceIdentifier)
  }

  def deleteDatabase(instanceIdentifier: String): Unit = {
    val deleteDbInstanceRequest = new DeleteDBInstanceRequest().
      withDBInstanceIdentifier(instanceIdentifier).
      withSkipFinalSnapshot(true)
    client.deleteDBInstanceAsync(deleteDbInstanceRequest).get()
  }

  def waitForDatabaseToGoAway(instanceIdentifier: String, timeoutDuration: FiniteDuration): Unit = {
    val howSoonToStartChecking = Duration.Zero
    val howOftenToCheck = Duration(5, TimeUnit.SECONDS)
    val itsGoneNow = Promise[Unit]()
    val checkIfDatabaseGone: Runnable = () => {
      if (!databaseExists(instanceIdentifier)) {
        itsGoneNow.success(())
      }
    }
    val periodic = actorSystem.scheduler.schedule(howSoonToStartChecking, howOftenToCheck, checkIfDatabaseGone)
    try {
      Await.ready(itsGoneNow.future, timeoutDuration)
    } finally {
      periodic.cancel()
    }
  }
}
