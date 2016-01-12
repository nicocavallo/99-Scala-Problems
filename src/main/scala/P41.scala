package org.p99.scala

object P41 extends App{
  import P40._

  private def isEven(n:Int) = n % 2 == 0

  def goldbachListLimited(r: Range, i: Int) = goldbachList(r).filterNot { case (n1,n2) => n1 <= 50 }

  def goldbachList(r:Range) = r.toList filter { isEven } map { n =>
    goldbach(n)
  }
}
