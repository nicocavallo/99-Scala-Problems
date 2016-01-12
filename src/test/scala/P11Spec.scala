package org.p99.scala

import org.scalatest._

class P11Spec extends UnitSpec {

  import P11._

  "encodeModified" should "encode in such a way that if an element has no duplicates it is simply copied into the result list" in {
    assert(encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
  }

}

