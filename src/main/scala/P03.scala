package org.p99.scala

object P03 {

  def nth[T](n: Int,list:List[T]):T = {
    if (Option(list).isDefined && list.size > n)
      list(n)
    else
      throw new NoSuchElementException
  }

}
