package org.p99.scala

object P20 {
  def removeAt[T](i: Int, list: List[T]): (List[T],T) = {
    val o = list(i)
    val (first,second) = list.splitAt(i)
    (first ++ second.tail,o)
  }

}
