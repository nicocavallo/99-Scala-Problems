package org.p99.scala

import org.scalatest._

class P32Spec extends UnitSpec {

  "gdc" should "determine the greatest common divisor of two positive integer numbers" in {
    assert(P32.gcd(36, 63) == 9)
  }

}

