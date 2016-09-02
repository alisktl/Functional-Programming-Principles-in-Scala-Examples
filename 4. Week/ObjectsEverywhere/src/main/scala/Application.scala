import idealized.scala.{true_, false_}

/**
  * Created by alisher on 8/30/16.
  */
object Application {
  def main(args: Array[String]): Unit = {
    println(true_ > false_)
    println(true_ < false_)
    println(false_ > true_)
    println(false_ < true_)
  }
}
