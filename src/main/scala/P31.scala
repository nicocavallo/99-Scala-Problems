package org.p99.scala

object P31 {
  def isPrime(n: Int): Boolean = !(2 to n/2).exists( n % _ == 0)

}
