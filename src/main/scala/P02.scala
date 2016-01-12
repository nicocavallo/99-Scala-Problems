package org.p99.scala

object P02 {

  def penultimate[T](list:List[T]):T = list match {
    case head :: Nil => throw new NoSuchElementException
    case head :: (head1 :: Nil )=> head
    case head :: tail => penultimate(tail)
  }

}
