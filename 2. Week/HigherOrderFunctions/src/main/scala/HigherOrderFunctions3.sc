import scala.annotation.tailrec

object HigherOrderFunctions3 {

  def sum(f: Int => Int)(a: Int, b: Int): Int = {

    @tailrec
    def loop(a: Int, acc: Int): Int = {
      if(a > b) acc
      else
        loop(a + 1, acc + f(a))
    }

    loop(a, 0)
  }

  def fact(x: Int): Int = {
    if (x <= 1) 1
    else
      x * fact(x - 1)
  }

  // The sum of integers between a and b
  def sumInts(a: Int, b: Int): Int = sum(x => x)(a, b)

  // The sum of cubes of integers between a and b
  def sumCubes(a: Int, b: Int): Int = sum(x => x * x * x)(a, b)

  // The sum of factorials of integers between a and b
  def sumFactorials(a: Int, b: Int): Int = sum(fact)(a, b)

  // test
  sumInts(3, 4)
  sumCubes(3, 4)
  sumFactorials(3, 4)
}