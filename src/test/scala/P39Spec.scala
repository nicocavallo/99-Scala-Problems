package org.p99.scala

import org.scalatest._

class P39Spec extends UnitSpec {

  "listPrimesinRange" should "construct a list of all prime numbers in a range" in {
    assert(P39.listPrimesInRange(7, 31) == List(7, 11, 13, 17, 19, 23, 29, 31))
  }

}

