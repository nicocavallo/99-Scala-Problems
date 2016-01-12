package org.p99.scala

object P14 {

  def duplicate[T](list:List[T]): List[T] = list.foldLeft(List[T]()) { (acc,v) =>
    acc ++ List(v,v)
  }

}
