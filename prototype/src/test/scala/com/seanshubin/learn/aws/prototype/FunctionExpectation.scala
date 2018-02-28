package com.seanshubin.learn.aws.prototype

class FunctionExpectation[Input, Output](values:(Input, Seq[Output])*) extends Function[Input, Output]{
  val valuesMap = Map(values:_*)
  var indexMap:Map[Input, Int] = Map().withDefaultValue(0)

  override def apply(input:Input):Output = {
    valuesMap.get(input) match {
      case Some(valueSeq) =>
        val index = indexMap(input)
        if(index >= valueSeq.size) {
          throw new RuntimeException(s"Input value '$input' showed up more than ${valueSeq.size} times")
        } else {
          val value = valueSeq(index)
          indexMap = indexMap.updated(input, index+1)
          value
        }
      case None =>
        throw new RuntimeException(s"Unexpected input value $input")
    }
  }
}
