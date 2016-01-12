package org.p99.scala

object P08 {

  def compress[T](list:List[T]): List[T] = list match {
    case h :: Nil => list
    case head :: (h :: tail) => if (head != h) head :: compress(list.tail) else compress(list.tail)
    case _ => Nil
  }

}
