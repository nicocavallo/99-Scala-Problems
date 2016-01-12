package org.p99.scala

object P05 {

  def reverse[T](list:List[T]): List[T] = {
    if (list == null)
      list
    else
      list.reverse
  }

}
