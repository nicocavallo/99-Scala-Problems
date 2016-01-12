package org.p99.scala

object P37 {

  def totient(n: Int) = {
    val factorMultiplicity = P36.primeFactorMultiplicity(n).toList
    factorMultiplicity.foldLeft(1.0) { case (acc,v) =>
      acc*(v._1-1)*Math.pow(v._1,(v._2-1))
    }

  }

}
