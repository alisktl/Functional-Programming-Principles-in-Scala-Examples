package pattern_matching

/**
  * Created by alisher on 9/1/16.
  */
trait Expr
case class Number(n: Int) extends Expr
case class Sum(e1: Expr, e2: Expr) extends Expr
