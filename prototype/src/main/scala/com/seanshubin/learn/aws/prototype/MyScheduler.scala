package com.seanshubin.learn.aws.prototype

import java.util.concurrent.Executors

import akka.actor.LightArrayRevolverScheduler
import akka.event.NoLogging
import com.typesafe.config.ConfigFactory

object MyScheduler extends LightArrayRevolverScheduler(
  config = ConfigFactory.defaultReference(),
  log = NoLogging,
  threadFactory = Executors.defaultThreadFactory()) {}
