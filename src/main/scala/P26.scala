package org.p99.scala

object P26 {
  def combinations[T](n:Int, list: List[T]): List[List[T]] =
    if (n > list.length) Nil
    else if (n == 1) list.map(List(_))
    else combinations(n-1,list.tail).map(list.head :: _) ::: combinations(n, list.tail)

}
