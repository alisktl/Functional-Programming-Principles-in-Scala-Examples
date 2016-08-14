object HigherOrderFunctions {

  def cube(x: Int): Int = x * x * x

  def fact(x: Int): Int = {
    if (x <= 1) 1
    else
      x * fact(x - 1)
  }

  // The sum of integers between a and b
  def sumInts(a: Int, b: Int): Int = {
    if (a > b) 0
    else
      a + sumInts(a + 1, b)
  }

  // The sum of cubes of integers between a and b
  def sumCubes(a: Int, b: Int): Int = {
    if (a > b) 0
    else
      cube(a) + sumCubes(a + 1, b)
  }

  // The sum of factorials of integers between a and b
  def sumFactorials(a: Int, b: Int): Int = {
    if (a > b) 0
    else
      fact(a) + sumFactorials(a + 1, b)
  }

  // test
  sumInts(3, 4)
  sumCubes(3, 4)
  sumFactorials(3, 4)
}