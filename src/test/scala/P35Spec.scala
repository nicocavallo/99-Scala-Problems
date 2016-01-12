package org.p99.scala

import org.scalatest._

class P35Spec extends UnitSpec {

  "primeFactors" should "construct a flat list containing the prime factors in ascending order" in {
    assert(P35.primeFactors(315) == List(3, 3, 5, 7))
  }

}

