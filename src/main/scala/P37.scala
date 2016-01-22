package org.p99.scala

object P37 {

  def totient(n: Int) = {
    val factorMultiplicity = P36.primeFactorMultiplicity(n).toList
    factorMultiplicity.foldLeft(1.0) { case (acc,(v1,v2)) =>
      acc*(v1-1)*Math.pow(v1,(v2-1))
    }

  }

}
