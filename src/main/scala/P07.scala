package org.p99.scala

object P07 {

  def flatten[T](listOfLists:List[Any]):List[Any] = listOfLists.foldLeft(List[Any]()) {
    case (acc,v@List(_*)) => acc ++ flatten(v)
    case (acc,v) => acc :+ v
  }

}
