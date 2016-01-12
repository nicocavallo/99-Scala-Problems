package org.p99.scala

import org.scalatest._

class P30Spec extends UnitSpec {

  "lsortFreq" should "sort lists with rare lengths are placed, others with a more frequent length come later" in {
    assert(P30.lsortFreq(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
    == List(List('i, 'j, 'k, 'l), List('o), List('a, 'b, 'c), List('f, 'g, 'h), List('d, 'e), List('d, 'e), List('m, 'n)))
  }

}

