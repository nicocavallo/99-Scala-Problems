package org.p99.scala

import org.scalatest._

class P04Spec extends UnitSpec {

  import P04._

  "length" should "return 6 from List(1, 1, 2, 3, 5, 8)" in {
    assert(length(List(1, 1, 2, 3, 5, 8)) == 6)
  }

}

