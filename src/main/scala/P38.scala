package org.p99.scala

object P38 {

  def profile[T](block: => T):Long = {
    val start = System.currentTimeMillis()
    println("Starting block execution...")
    block
    val finishedIn = System.currentTimeMillis() - start
    println(s"...It took $finishedIn millis")
    finishedIn
  }

}
