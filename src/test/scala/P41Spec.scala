package org.p99.scala

import org.scalatest._

class P41Spec extends UnitSpec {

  "goldbachList" should "given a range, calculate Golbach's composition for every n" in {
    assert(P41.goldbachList(9 to 20) == List((3,7),(5,7),(3,11),(3,13),(5,13),(3,17)))
  }

  "goldbachListLimited" should "given a range, calculate Golbach's composition for every n > 50" in {
    val range = P41.goldbachListLimited(2 to 3000,50)
    assert(range.size > 0)
    range.foreach {
      case (n1,n2) => assert(n1 > 50 && n2 > 50)
    }
    range foreach { case (n1,n2) =>
      println(s"${n1+n2} = $n1 + $n2")
    }
  }

}

