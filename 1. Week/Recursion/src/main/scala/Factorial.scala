import scala.annotation.tailrec

/**
  * Created by alisher on 8/6/16.
  */
object Factorial {

  def factorial(n: Int): Int = {
    if(n == 0) 1
    else
      n * factorial(n - 1)
  }

  def factorialTailRec(n: Int): Int = {

    @tailrec
    def loop(acc: Int, n: Int): Int = {
      if(n == 0) acc
      else
        loop(acc * n, n - 1)
    }
    loop(1, n)
  }

  /*
  factorial(5)
  factorialTailRec(5)
  */
}
