package org.p99.scala

object P30 {
  def lsortFreq[T](listOfLists: List[List[T]]) = {
    val mapOfFreq = listOfLists.groupBy(_.size) map { case (k,v) => (k,v.size) }
    listOfLists.sortBy( l => mapOfFreq(l.size))
  }

}
