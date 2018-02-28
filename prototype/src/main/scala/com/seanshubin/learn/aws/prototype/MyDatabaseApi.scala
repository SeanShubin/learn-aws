package com.seanshubin.learn.aws.prototype

import scala.concurrent.duration._

trait MyDatabaseApi {
  def createDatabase(instanceIdentifier: String): Unit

  def databaseExists(instanceIdentifier: String): Boolean

  def deleteDatabase(instanceIdentifier: String): Unit

  def waitForDatabaseToGoAway(instanceIdentifier: String, timeoutDuration: FiniteDuration): Unit
}
