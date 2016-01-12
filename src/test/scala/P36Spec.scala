package org.p99.scala

import org.scalatest._

class P36Spec extends UnitSpec {

  "primeFactorMultiplicity" should "construct a list containing the prime factors and their multiplicity" in {
    assert(P36.primeFactorMultiplicity(315) == Map(3 -> 2, 5 -> 1, 7 -> 1))
  }

}

