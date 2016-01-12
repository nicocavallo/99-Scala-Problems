package org.p99.scala

import org.scalatest._

class P26Spec extends UnitSpec {

  "combinations" should "generate the combinations of K distinct objects chosen from the N elements of a list" in {
    val combinations = P26.combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
    println(combinations)
    assert(combinations.size == 20)
  }

}

