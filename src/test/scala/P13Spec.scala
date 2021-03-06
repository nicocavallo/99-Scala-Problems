package org.p99.scala

import org.scalatest._

class P13Spec extends UnitSpec {

  import P13._

  "encode" should "encode consecutive duplicates of elements as tuples (N, E) where N is the number of duplicates of the element E" in {
    assert(encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }

}

