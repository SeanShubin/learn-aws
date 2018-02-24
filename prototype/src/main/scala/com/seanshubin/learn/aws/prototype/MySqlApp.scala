package com.seanshubin.learn.aws.prototype

import com.amazonaws.services.rds.model.CreateDBInstanceRequest

object MySqlApp extends App {
  val dBInstanceIdentifier: String = ""
  val allocatedStorage: Integer = 0
  val dBInstanceClass: String = ""
  val engine: String = ""
  val masterUsername: String = ""
  val masterUserPassword: String = ""
  new CreateDBInstanceRequest(
    dBInstanceIdentifier,
    allocatedStorage,
    dBInstanceClass,
    engine,
    masterUsername,
    masterUserPassword)
}
