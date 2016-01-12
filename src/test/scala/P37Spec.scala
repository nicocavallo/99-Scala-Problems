package org.p99.scala

import org.scalatest._

class P37Spec extends UnitSpec {

  import P37._

  "totient" should "calculate the number of positive integers r (1 <= r <= m) that are coprime to m" in {
    assert(totient(10) == 4)
  }

  it should "return n -1 if n is prime" in {
    assert(totient(7) == 6)
    assert(totient(13) == 12)
  }

  it should "return the same when doing totient(n*m) or totient(n)*totient(m)" in {
    assert(totient(2*3) == totient(2)*totient(3))
  }

}

