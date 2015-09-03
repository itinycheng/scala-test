package com.test.scala

import com.test.scala.traits.FormatLogger
import com.test.scala.traits.Logger
import com.test.scala.traits.TimeStampLogger
import com.test.scala.traits.TimeStampLogger
import com.test.scala.traits.TimeStampLogger
import com.test.scala.traits.Logger
import com.test.scala.traits.TimeStampLogger
import com.test.scala.traits.FormatLogger
import scala.math.Ordered
import scala.util.Random

class SavingAccount extends Logger with Ordered[SavingAccount] {
  private val num = Random.nextInt();
  def log(msg: String): Unit = {
    println(msg)
  }
  def compare(that: SavingAccount): Int = this.num - that.num
}

object SavingAccount{
  def main(args: Array[String]): Unit = {
    val a = new SavingAccount with FormatLogger with TimeStampLogger
    val b = new SavingAccount with FormatLogger with TimeStampLogger
    a.log(" msg")
    println(a >= b)
  }
}