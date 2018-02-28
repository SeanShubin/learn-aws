package com.seanshubin.learn.aws.prototype

import akka.actor.{Cancellable, Scheduler}

import scala.concurrent.ExecutionContext
import scala.concurrent.duration.FiniteDuration

class SchedulerNotImplemented extends Scheduler {
  override def schedule(initialDelay: FiniteDuration, interval: FiniteDuration, runnable: Runnable)(implicit executor: ExecutionContext): Cancellable = ???

  override def scheduleOnce(delay: FiniteDuration, runnable: Runnable)(implicit executor: ExecutionContext): Cancellable = ???

  override def maxFrequency: Double = ???
}
