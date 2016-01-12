package org.p99.scala

object P34 {

  def totient(n: Int) = (1 to n).filter(P33.isCoprimeTo(_,n)).size

}
