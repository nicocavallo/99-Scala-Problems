package org.p99.scala

import org.scalatest._

class P24Spec extends UnitSpec {

  "lotto" should "draw N different random numbers from the set 1..M" in {
    val numbers = 10
    val res = P24.lotto(numbers, 70)
    assert(res.size == numbers)
    assert(res == res.distinct)
  }

}

