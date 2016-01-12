package org.p99.scala

object P32 {

  def gcd(n1: Int, n2: Int) = {
    val d1 = divisors(n1)
    val d2 = divisors(n2)
    Some(d1.intersect(d2)).filterNot(_.isEmpty).getOrElse(List(1)).last
  }

  def divisors(n: Int) = (1 to n/2).filter(n % _ ==0) :+ n

}
