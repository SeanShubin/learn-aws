package com.seanshubin.learn.aws.prototype

import java.util.concurrent.TimeUnit

import org.scalatest.FunSuite

import scala.concurrent.duration.Duration

class CreateDatabaseTest extends FunSuite {
  test("create database") {
    // given
    val databaseName = "sean-test-mysql-db"
    val api = new MyDatabaseApi

    // when-then
    assert(api.databaseExists(databaseName) === false)
    api.createDatabase(databaseName)
    assert(api.databaseExists(databaseName) === true)
    api.deleteDatabase(databaseName)
    api.waitForDatabaseToGoAway(databaseName, Duration(2, TimeUnit.MINUTES))
    assert(api.databaseExists(databaseName) === false)
  }
}
