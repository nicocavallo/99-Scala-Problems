package org.p99.scala

import org.scalatest._

class P05Spec extends UnitSpec {

  import P05._

  "reverse" should "return List(8, 5, 3, 2, 1, 1) from List(1, 1, 2, 3, 5, 8)" in {
    assert(reverse(List(1, 1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1, 1))
  }

}

