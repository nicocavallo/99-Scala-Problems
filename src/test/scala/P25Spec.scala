package org.p99.scala

import org.scalatest._

class P25Spec extends UnitSpec {

  "randomPermute" should "generate a random permutation of the elements of a list" in {
    val list = List('a, 'b, 'c, 'd, 'e, 'f)
    val res = P25.randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
    assert(list.size == res.size)
    assert(list.forall(res contains _))
    assert(list != res)
  }

}

