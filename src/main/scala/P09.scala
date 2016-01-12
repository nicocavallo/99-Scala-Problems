package org.p99.scala

object P09 {

  def pack[T](list:List[T]):List[List[T]] = packAcc(Nil,list)

  def packAcc[T](acc:List[List[T]],list:List[T]):List[List[T]] = list match {
    case Nil => acc
    case h :: Nil => acc ++ List(List(h))
    case h :: tail => {
      val (take,rest) = list.span(_ == h)
      packAcc(acc ++ List(take),rest)
    }
  }

}
