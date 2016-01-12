package org.p99.scala

import org.scalatest._

class P06Spec extends UnitSpec {

  import P06._

  "isPalindrome" should "return true in the case of List(1, 2, 3, 2, 1)" in {
    assert(isPalindrome(List(1, 2, 3, 2, 1)))
  }

  it should "return false in the case of List(1, 2, 3, 1)" in {
    assert(!isPalindrome(List(1, 2, 3, 1)))
  }

}

