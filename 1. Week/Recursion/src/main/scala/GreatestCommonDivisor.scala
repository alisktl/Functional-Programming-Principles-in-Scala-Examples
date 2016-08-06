import scala.annotation.tailrec

/**
  * Created by alisher on 8/6/16.
  */
object GreatestCommonDivisor {

  @tailrec
  def gcd(a: Int, b: Int): Int = {
    if (b == 0) a
    else gcd(b, a % b)
  }

  /*
  gcd(14, 21)
  */
}
