package org.p99.scala

object P11 {

  def encodeModified[T](list:List[T]): List[Any] = P10.encode(list) map { l =>
    l match {
      case (1,a) => a
      case (n,a) => (n,a)
    }
  }

}
