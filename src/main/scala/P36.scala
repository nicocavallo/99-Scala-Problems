package org.p99.scala

object P36 {

  import P35._

  def primeFactorMultiplicity(n: Int) = primeFactors(n).groupBy(x => x) map { case (key,list) =>
    (key, list.size)
  }


}
