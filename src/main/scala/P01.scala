package org.p99.scala

object P01 {

  def last[T](list:List[T]):Option[T] = list match {
    case head :: tail => list.lastOption
    case _ => throw new NoSuchElementException
  }

}
