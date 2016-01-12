package org.p99.scala

object P39 {
  
  import P31._
  
  def listPrimesInRange(from: Int, to: Int) = (from to to).filter( isPrime ).toList

}
