package org.p99.scala

object P12 {

  def decode[T](list:List[(Int,T)]):List[T] = list.flatMap { case (n,v) =>
    (0 until n).map(_ => v).toList
  }

}
