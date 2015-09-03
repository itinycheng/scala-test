package com.test.scala.traits

import java.util.Date

trait TimeStampLogger extends Logger {
  abstract override def log(msg: String) {
    super.log(new Date() + " " + msg)
  }
}