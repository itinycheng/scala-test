package com.test.scala.actor

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props

object AkkaActorTest extends App{
  val actsys = ActorSystem();  
  class Hi extends Actor{
    def receive = {
      case msg:String => println("hello " + msg)
    }
  }
  
  def show(m : String) = {
    val act = actsys.actorOf(Props[Hi])
    act ! m
    act ! m + ", nice to see you"
  }
  val names = Array[String]("kafka","hadoop","storm")
  for(name <- names) show(name)
}