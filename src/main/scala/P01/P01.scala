package P01

object P01 {
  def last(lst: List[Int]): Int = lst.last

  def lastRecursive(lst: List[Int]): Int = {
    lst match {
      case e :: Nil => e
      case e :: rest => lastRecursive(rest)
      case _ => throw new ArrayIndexOutOfBoundsException
    }
  }

  def main(args: Array[String]): Unit = {
    println(lastRecursive(List(1, 1, 2, 3, 5, 8)))
  }
}
