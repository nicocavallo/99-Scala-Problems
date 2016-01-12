package org.p99.scala

import org.scalatest._

class P12Spec extends UnitSpec {

  import P12._

  "decode" should "construct an uncompressed version of List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))" in {
    assert(decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) == List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  }

}

