package org.p99.scala

import scala.util.Random

object P23 {

  def randomSelect[T](i: Int, list: List[T]):List[T] = {
    if (i <= 0 || list.isEmpty)
      Nil
    else {
      val n = Random.nextInt(list.size)
      val (rest,element) = P20.removeAt(n,list)
      element :: randomSelect(i-1,rest)
    }
  }

}
