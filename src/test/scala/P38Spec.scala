package org.p99.scala

import org.scalatest._

class P38Spec extends UnitSpec {

  import P38._

  "P38" should "compare P34 and P37" in {
    assert(profile { P34.totient(10090) } > profile { P37.totient(10090) })
  }

}

