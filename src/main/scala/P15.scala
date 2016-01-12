package org.p99.scala

object P15 {

  def duplicateN[T](n:Int, list:List[T]): List[T] = list.flatMap { e =>
    ((0 until n).map(_ => e)).toList
  }

}
