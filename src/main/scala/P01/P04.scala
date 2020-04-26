package main.scala.P01

object P04 {
  def length[A](lst: List[A]): Int = lst.length

  def lengthRecursive[A](lst: List[A], cnt: Int = 0): Int = {
    lst match {
      case x :: tail => lengthRecursive(tail, cnt + 1)
      case Nil => cnt
    }
  }
  def main(args: Array[String]): Unit = {
    println(length(List(1,1,2,3,5,8)))
    println(lengthRecursive(List()))
  }
}
