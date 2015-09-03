package com.test.scala.traits


trait FormatLogger extends Logger  {
  abstract override def log(msg : String){
    super.log("FormatLogger " + msg)
  }
}