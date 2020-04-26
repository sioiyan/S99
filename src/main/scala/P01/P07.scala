package main.scala.P01

object P07 {
  def flatten(lst: List[Any]): List[Any] = {
    println(s"lst: $lst")
    val lst2 = lst flatMap{
      case ls: List[_] => flatten(ls)
      case e => List(e)
    }
    println(s"lst2: $lst2")
    lst2
  }
  def flattenMapOnly(lst: List[Any]): List[Any] = {
    println(lst)
    val lst2 = lst map{
      case ls: List[_] => flattenMapOnly(ls)
      case e => List(e)
    }
    lst2
  }

  def main(args: Array[String]): Unit = {
    println("flattenなしの場合")
    println(flattenMapOnly(List(List(1,2,List(3,4)),6,List(7,8))))

    println("\nflattenありの場合")
    println(flatten(List(List(1,2,List(3,4)),6,List(7,8))))
  }
}
