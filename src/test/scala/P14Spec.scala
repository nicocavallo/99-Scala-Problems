package org.p99.scala

import org.scalatest._

class P14Spec extends UnitSpec {

  import P14._

  "duplicate" should "duplicate the elements of a list" in {
    assert(duplicate(List('a, 'b, 'c, 'c, 'd)) == List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))
  }

}

