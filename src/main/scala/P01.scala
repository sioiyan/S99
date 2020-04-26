object P01 {
  def last(lst: List[Int]): Int = lst.last

  def main(args: Array[String]): Unit = {
    println(last(List(1, 1, 2, 3, 5, 8)))
  }
}