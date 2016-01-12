package org.p99.scala

import org.scalatest._

class P33Spec extends UnitSpec {

  "isCoprimeTo" should "determine whether two positive integer numbers are coprime. Two numbers are coprime if their greatest common divisor equals 1" in {
    assert(P33.isCoprimeTo(35, 64))
  }

}

