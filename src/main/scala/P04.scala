package org.p99.scala

object P04 {

  def length(list:List[Any]):Int = {
    if (Option(list).isEmpty)
      0
    else
      list.size
  }

}
