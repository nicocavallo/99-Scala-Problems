package org.p99.scala

object P19 {
  def rotate[T](i: Int, list: List[T]) = {
    val index = if (i >= 0) i else list.size + i
    val (take,rest) = list.splitAt(index)
    rest ++ take
  }

}
