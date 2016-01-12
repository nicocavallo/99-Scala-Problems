package org.p99.scala

import org.scalatest._

class P15Spec extends UnitSpec {

  import P15._

  "duplicateN" should "duplicate the elements of a list a given number of times" in {
    assert(duplicateN(3, List('a, 'b, 'c, 'c, 'd)) == List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd))
  }

}

