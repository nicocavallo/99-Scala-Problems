package org.p99.scala

import org.scalatest._

class P02Spec extends UnitSpec {

  import P02._

  "penultimate" should "return 5 from List(1, 1, 2, 3, 5, 8)" in {
    assert(penultimate(List(1, 1, 2, 3, 5, 8)) == 5)
  }

}

