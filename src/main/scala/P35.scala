package org.p99.scala

object P35 {

  import P31._

  def findNextPrime(prime: Int): Int = {
    if (prime == 2)
      prime + 1
    else if (isPrime(prime + 2)) {
      prime + 2
    } else {
      prime + 4
    }
  }

  def primeFactorsAcc(n: Int, primeFactor: Int, acc: List[Int]): List[Int] = {
    if (n == 1)
      acc
    else {
      if (n % primeFactor == 0)
        primeFactorsAcc(n / primeFactor, primeFactor, acc :+ primeFactor)
      else primeFactorsAcc(n, findNextPrime(primeFactor), acc)
    }
  }

  def primeFactors(n: Int): List[Int] = primeFactorsAcc(n, 2, List())

}