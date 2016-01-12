package org.p99.scala

object P27 {
  def group3[T](list: List[T]): List[List[List[T]]] = {
   val g2 = P26.combinations(2,list)
   val g3 = P26.combinations(3,list)
   val g4 = P26.combinations(4,list)
   List(g2,g3,g4)
  }

}
