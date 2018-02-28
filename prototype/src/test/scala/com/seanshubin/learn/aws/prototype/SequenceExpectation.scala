package com.seanshubin.learn.aws.prototype

class SequenceExpectation[Output](values: Output*) extends Function0[Output] {
  var index = 0

  override def apply(): Output = {
    if (index >= values.size) {
      throw new RuntimeException(s"Invocation happened more than ${values.size} times")
    } else {
      val value = values(index)
      index = index + 1
      value
    }
  }
}
