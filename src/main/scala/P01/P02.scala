package main.scala.P01

object P02 {
  def penultimate[A](lst: List[A]): A = {
    lst match {
      case x :: _ :: Nil => x
      case x :: tail => penultimate(tail)
      case _ => throw new ArrayIndexOutOfBoundsException
    }
  }

  def penultimateEasy[A](lst: List[A]): A = lst.init.last

  def main(args: Array[String]): Unit = {
    println(penultimateEasy(List(1,2,3,4,5)))
    println(penultimateEasy(List(1,2)))
//    println(penultimate(List(1)))
//    println(penultimate(List()))
  }
}
