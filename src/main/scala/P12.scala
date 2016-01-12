package org.p99.scala

object P12 {

  def decode[T](list:List[(Int,T)]):List[T] = list.flatMap { e =>
    (0 until e._1).map(_ => e._2).toList
  }

}
