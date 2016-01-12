package org.p99.scala

import org.scalatest._

class P23Spec extends UnitSpec {

  "randomSelect" should "extract a given number of randomly selected elements from a list" in {
    val list = List('a, 'b, 'c, 'd, 'f, 'g, 'h)
    val res = P23.randomSelect(3, list)
    assert(res.size == 3)
    assert(res.forall(list contains _))
  }

}

