object HigherOrderFunctions2 {

  def id(x: Int): Int = x

  def sum(f: Int => Int, a: Int, b: Int): Int = {
    if(a > b) 0
    else
      f(a) + sum(f, a + 1, b)
  }

  def cube(x: Int): Int = x * x * x

  def fact(x: Int): Int = {
    if (x <= 1) 1
    else
      x * fact(x - 1)
  }

  // The sum of integers between a and b
  def sumInts(a: Int, b: Int): Int = sum(id, a, b)

  // The sum of cubes of integers between a and b
  def sumCubes(a: Int, b: Int): Int = sum(cube, a, b)

  // The sum of factorials of integers between a and b
  def sumFactorials(a: Int, b: Int): Int = sum(fact, a, b)

  // test
  sumInts(3, 4)
  sumCubes(3, 4)
  sumFactorials(3, 4)
}