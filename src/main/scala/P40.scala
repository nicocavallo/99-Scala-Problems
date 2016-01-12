package org.p99.scala

object P40 {

  import P31._
  import P35._

  def goldbachRec(n: Int, i: Int): (Int, Int) = {
    if (isPrime(n-i)) {
      (i,(n-i))
    } else {
      goldbachRec(n,findNextPrime(i))
    }
  }

  def goldbach(n: Int):(Int,Int) = {
    goldbachRec(n,2)
  }

}
