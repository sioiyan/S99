package main.scala.P01

object P05 {
  def reverse[A](lst: List[A], result: List[A] = List()): List[A] = {
    lst match {
      case e :: tail => reverse(tail, e :: result)
      case _ => result
    }
  }

  def main(args: Array[String]): Unit = {
    println(reverse(List(1,2,3,4,5)))
    println(reverse(List(1,2)))
    println(reverse(List()))
  }
}
