package org.p99.scala

object P13 {

  def encodeDirect[T](list:List[T]): List[(Int,T)] = list match {
    case Nil => Nil
    case h :: tail => {
      val (take,rest) = list.span(_.equals(h))
      (take.size,h) :: encodeDirect(rest)
    }
  }

}
