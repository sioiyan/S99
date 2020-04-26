package main.scala.P01

object P06 {
  def reverse[A](lst: List[A], result: List[A] = List()): List[A] = {
    lst match {
      case e :: tail => reverse(tail, e :: result)
      case _ => result
    }
  }

  def isPaindrome[A](lst: List[A]): Boolean = {
    lst == reverse(lst)
  }

  def main(args: Array[String]): Unit = {
    println(isPaindrome(List(1,2,3,4,5)))
    println(isPaindrome(List(1,2,3,2,1)))
  }
}
