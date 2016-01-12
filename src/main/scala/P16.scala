package org.p99.scala

object P16 {
  def drop[T](n: Int, list: List[T]):List[T] = list match {
    case Nil => Nil
    case h :: Nil => List(h)
    case _ => {
      if (list.size < n) {
        list
      } else {
        val (take,rest) = list.splitAt(n)
        take.init ++ drop(n,rest)
      }
    }
  }

}
