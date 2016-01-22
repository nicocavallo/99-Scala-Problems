package org.p99.scala

object P26 {
  def combinations[T](n:Int, list: List[T]): List[List[T]] = list match {
    case Nil => Nil
    case l if n > l.length => Nil
    case l if n == 1 => l.map(List(_))
    case _ => combinations(n-1,list.tail).map(list.head :: _) ::: combinations(n, list.tail)
  }

}
