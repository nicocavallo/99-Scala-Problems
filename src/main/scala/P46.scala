package org.p99.scala

object P46 {

  implicit class BooleanOps(thiz: Boolean) {

    def and(that:Boolean) = thiz && that
    def or(that:Boolean) = thiz || that
    def nand(that:Boolean) = !(thiz && that)
    def nor(that:Boolean) = !(thiz || that)
    def xor(that:Boolean) = (thiz,that) match {
      case (true,true)  => false
      case (true,false) => true
      case (false,true) => true
      case (false,false)  => false
    }
    def impl(that:Boolean) = (!thiz) or that
    def equ(that:Boolean) = (thiz impl that) == (that impl thiz)

  }
}
