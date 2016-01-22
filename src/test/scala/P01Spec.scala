package org.p99.scala

import org.scalatest._

class P01Spec extends UnitSpec {

  import P01._

  "last" should "return 8 from List(1, 1, 2, 3, 5, 8)" in {
    assert(last(List(1, 1, 2, 3, 5, 8)) == Some(8))
  }

}

