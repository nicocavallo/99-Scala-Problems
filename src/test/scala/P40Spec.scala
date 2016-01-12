package org.p99.scala

import org.scalatest._

class P40Spec extends UnitSpec {

  "goldbach" should "find the two prime numbers that sum up to a given even integer" in {
    assert(P40.goldbach(28) == (5,23))
  }

}

