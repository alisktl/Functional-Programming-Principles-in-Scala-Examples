/**
  * Created by alisher on 9/2/16.
  */
object Main {
  def main(args: Array[String]): Unit = {
    val list = List(4, 5, 1, 10)
    val list2 = isort(list)

    val list3 = 12 :: 4 :: 2 :: 54 :: 9 :: Nil
    val list4 = isort(list3)

    val list5 = Nil.::(12).::(32).::(2).::(7)
    val list6 = isort(list5)

    println("--------")
    println("initial: " + list)
    println("sorted: " + list2)
    println("--------")
    println("initial: " + list3)
    println("sorted: " + list4)
    println("--------")
    println("initial: " + list5)
    println("sorted: " + list6)
    println("--------")
  }

  // Insertion Sort
  def isort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case y :: ys => insert(y, isort(ys))
  }

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys => if(x <= y) x :: xs else y :: insert(x, ys)
  }
}
