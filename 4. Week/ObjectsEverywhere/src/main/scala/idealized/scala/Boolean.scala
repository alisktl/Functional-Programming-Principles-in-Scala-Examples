package idealized.scala

/**
  * Created by alisher on 8/30/16.
  */
abstract class Boolean {
  def ifThenElse[T](t: => T, e: => T): T

  def && (x: => Boolean): Boolean = ifThenElse(x, false_)
  def || (x: => Boolean): Boolean = ifThenElse(true_, x)
  def unary_! : Boolean = ifThenElse(false_, true_)

  def == (x: Boolean): Boolean = ifThenElse(x, !x)
  def != (x: Boolean): Boolean = ifThenElse(!x, x)

  def < (x: Boolean): Boolean = ifThenElse(false_, x)
  def > (x: Boolean): Boolean = ifThenElse(!x, false_)

  override def toString: String
}

object true_ extends Boolean {
  def ifThenElse[T](t: => T, e: => T) = t

  override def toString = "true"
}

object false_ extends Boolean {
  def ifThenElse[T](t: => T, e: => T) = e

  override def toString = "false"
}
