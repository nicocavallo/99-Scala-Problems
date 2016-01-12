package org.p99.scala

import org.scalatest._

class P08Spec extends UnitSpec {

 import P08._

  "compress" should "return List('a, 'b, 'c, 'a, 'd, 'e) form List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)" in {
    assert(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List('a, 'b, 'c, 'a, 'd, 'e))
  }

}

