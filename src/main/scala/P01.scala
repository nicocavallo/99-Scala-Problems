package org.p99.scala

object P01 {

  def last[T](list:List[T]):T = list match {
    case head :: tail => list.last
    case _ => throw new NoSuchElementException
  }

}
