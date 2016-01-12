package org.p99.scala

import org.scalatest._

class P07Spec extends UnitSpec {

  import P07._

  "flatten" should "return List(1, 1, 2, 3, 5, 8) from List(List(1, 1), 2, List(3, List(5, 8)))" in {
    assert(flatten(List(List(1, 1), 2, List(3, List(5, 8)))) == List(1, 1, 2, 3, 5, 8))
  }

}

