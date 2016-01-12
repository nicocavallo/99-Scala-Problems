package org.p99.scala

object P29 {

  def lsort[T](listOfLists: List[List[T]]) = listOfLists.sortBy(_.size)

}
