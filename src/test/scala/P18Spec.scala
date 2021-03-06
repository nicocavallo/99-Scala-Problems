package org.p99.scala

import org.scalatest._

class P18Spec extends UnitSpec {

  "slice" should "extract a slice from a list" in {
    assert(P18.slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('d, 'e, 'f, 'g))
  }

}

