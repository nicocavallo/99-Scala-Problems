package org.p99.scala

import org.scalatest._

class P20Spec extends UnitSpec {

  "removeAt" should "remove the Kth element from a list" in {
    assert(P20.removeAt(1, List('a, 'b, 'c, 'd)) == (List('a, 'c, 'd),'b))
  }

  it should "remove the last element from a list" in {
    assert(P20.removeAt(3, List('a, 'b, 'c, 'd)) == (List('a, 'b, 'c),'d))
  }


}

