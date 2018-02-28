package com.seanshubin.learn.aws.prototype

import java.util.concurrent.TimeUnit

import akka.actor.Scheduler
import com.amazonaws.services.rds.AmazonRDSAsync
import com.amazonaws.services.rds.model.{CreateDBInstanceRequest, DeleteDBInstanceRequest, DescribeDBInstancesRequest}

import scala.collection.JavaConverters._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.{Duration, _}
import scala.concurrent.{Await, Promise}

class MyDatabaseImplementation(rdsClient: AmazonRDSAsync, scheduler: Scheduler) extends MyDatabaseApi {
  override def createDatabase(instanceIdentifier: String): Unit = {
    val createDbInstanceRequest = new CreateDBInstanceRequest().
      withMasterUserPassword("square-tree").
      withDBInstanceIdentifier(instanceIdentifier).
      withEngine("mysql").
      withDBInstanceClass("db.t2.micro").
      withMasterUsername("sean").
      withAllocatedStorage(20)
    rdsClient.createDBInstance(createDbInstanceRequest)
  }

  override def databaseExists(instanceIdentifier: String): Boolean = {
    val describeDbInstancesRequest = new DescribeDBInstancesRequest()
    val describeDbInstancesResponse = rdsClient.describeDBInstances(describeDbInstancesRequest)
    val dbInstances = describeDbInstancesResponse.getDBInstances.asScala
    dbInstances.exists(dbInstance => dbInstance.getDBInstanceIdentifier == instanceIdentifier)
  }

  override def deleteDatabase(instanceIdentifier: String): Unit = {
    val deleteDbInstanceRequest = new DeleteDBInstanceRequest().
      withDBInstanceIdentifier(instanceIdentifier).
      withSkipFinalSnapshot(true)
    rdsClient.deleteDBInstanceAsync(deleteDbInstanceRequest).get()
  }

  override def waitForDatabaseToGoAway(instanceIdentifier: String, timeoutDuration: FiniteDuration): Unit = {
    val howSoonToStartChecking = Duration.Zero
    val howOftenToCheck = Duration(5, TimeUnit.SECONDS)
    val itsGoneNow = Promise[Unit]()
    val checkIfDatabaseGone: Runnable = () => {
      if (!databaseExists(instanceIdentifier)) {
        itsGoneNow.success(())
      }
    }
    val periodic = scheduler.schedule(howSoonToStartChecking, howOftenToCheck, checkIfDatabaseGone)
    try {
      Await.ready(itsGoneNow.future, timeoutDuration)
    } finally {
      periodic.cancel()
    }
  }
}
