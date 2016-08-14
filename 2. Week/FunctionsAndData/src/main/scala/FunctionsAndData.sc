import scala.annotation.tailrec

object FunctionsAndData {
  class Rational(x: Int, y: Int) {
    require(y != 0, "denominator must be nonzero!")

    def this(x: Int) = this(x, 1)

    @tailrec
    private def gcd(a: Int, b: Int): Int = {
      if (b == 0) a
      else gcd(b, a % b)
    }
    private val g = gcd(x, y)
    val numerator = x / g
    val denominator = y / g

    def add(r: Rational) = {
      new Rational(numerator * r.denominator + r.numerator * denominator, denominator * r.denominator)
    }

    def neg = new Rational(-numerator, denominator)

    def sub(that: Rational) = add(that.neg)

    def mul(r: Rational) = {
      new Rational(numerator * r.numerator, denominator * r.denominator)
    }

    def less(that: Rational) = {
      numerator * that.denominator < that.numerator * denominator
    }

    def max(that: Rational) = {
      if(less(that)) that
      else this
    }

    override
    def toString = {
      if(denominator * denominator == 1)
        numerator * denominator + ""
      else {
        numerator + "/" + denominator
      }
    }
  }

  val x = new Rational(1, 3)
  val y = new Rational(5, 7)
  val z = new Rational(3, 2)

  x.numerator
  x.add(y)
  x.sub(z).sub(y)
  x.mul(z)

  x.less(y)
  x.max(y)

  val t = new Rational(4)
  val w = new Rational(3, 0)
}
