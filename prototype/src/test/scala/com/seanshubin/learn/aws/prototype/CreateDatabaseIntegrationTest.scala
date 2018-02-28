package com.seanshubin.learn.aws.prototype

import java.util.concurrent.TimeUnit

import akka.actor.Scheduler
import com.amazonaws.services.rds.{AmazonRDSAsync, AmazonRDSAsyncClientBuilder}
import org.scalatest.FunSuite

import scala.concurrent.duration.Duration

class CreateDatabaseIntegrationTest extends FunSuite {
  test("create database") {
    // given
    val databaseName = "sean-test-mysql-db"
    val rdsClient: AmazonRDSAsync = AmazonRDSAsyncClientBuilder.defaultClient()
    val scheduler:Scheduler = MyScheduler
    val api:MyDatabaseApi = new MyDatabaseImplementation(rdsClient, scheduler)

    // when-then
    assert(api.databaseExists(databaseName) === false)
    api.createDatabase(databaseName)
    assert(api.databaseExists(databaseName) === true)
    api.deleteDatabase(databaseName)
    api.waitForDatabaseToGoAway(databaseName, Duration(2, TimeUnit.MINUTES))
    assert(api.databaseExists(databaseName) === false)
  }
}
