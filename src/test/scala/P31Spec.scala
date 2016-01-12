package org.p99.scala

import org.scalatest._

class P31Spec extends UnitSpec {

  "isPrime" should "determine whether a given integer number is prime" in {
    assert(P31.isPrime(7))
    assert(P31.isPrime(2))
    assert(P31.isPrime(1))
    assert(P31.isPrime(3))
    assert(P31.isPrime(17))
  }

}

