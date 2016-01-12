package org.p99.scala

import org.scalatest._

class P03Spec extends UnitSpec {

  import P03._

  "nth" should "return 2 when 2nd position from List(1, 1, 2, 3, 5, 8) is required" in {
    assert(nth(2,List(1, 1, 2, 3, 5, 8)) == 2)
  }

}

