package org.p99.scala

object P18 {
  def slice[T](i: Int, j: Int, list: List[T]) = {
    if (j < i) throw new IllegalArgumentException(s" i cannot be bigger than j")
    else list.drop(i).take(j-i)
  }

}
