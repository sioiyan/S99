package main.scala.P01

import scala.util.{Failure, Success, Try}

object P03 {
  def nth[A](index: Int, lst: List[A]): Either[Exception, A] = {
    Try(lst(index)) match {
      case Success(x) => Right(x)
      case Failure(_) => Left(new IndexOutOfBoundsException)
    }
  }

  def main(args: Array[String]): Unit = {
    val a = nth(2, List(2,3,5))
    val b = nth(4, List(2,3,5))

    for(x <- List(a, b)) {
      x match {
        case Right(x) => println(x)
        case Left(x) => println(x)
      }
    }
  }
}
