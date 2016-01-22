package org.p99.scala

object P06 {

  def isPalindrome[T](list:List[T]): Boolean = list match {
    case head :: Nil => true
    case Nil => true
    case head :: tail => {
      head == tail.lastOption.getOrElse(false) && isPalindrome(tail.init)
    }
  }

}
