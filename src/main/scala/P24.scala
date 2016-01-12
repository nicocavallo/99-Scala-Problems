package org.p99.scala


object P24 {

  import P22.range
  import P23.randomSelect

  def lotto(i: Int, m: Int):List[Int] = randomSelect(i,range(1,m))

}
