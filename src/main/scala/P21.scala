package org.p99.scala

object P21 {
  def insertAt[T](e: T, i: Int, list: List[T]) = {
    val (left,right) = list.splitAt(i)
    (left :+ e) ++ right
  }


}
