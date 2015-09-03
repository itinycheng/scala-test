
import scala.actors.Actor

object text extends App{
  class HiActor extends Actor {
    def act() = {
      while(true){
        receive{
          case msg : String => println("hello " + msg);
        }
      }
    }
  }
  
  def show (m:String) = {
    val ACTOR1 = new HiActor
    ACTOR1.start()
    ACTOR1 ! m
    ACTOR1 ! m+m}
  
  val scala = Array[String]("scala","actor","akka")
  
  for(i <- scala) show(i);
}