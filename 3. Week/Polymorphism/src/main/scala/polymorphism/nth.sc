import polymorphism.{Cons, Nil}

object nth {
  def nth[T](n: Int, xs: List[T]): T = {
    if(xs.isEmpty) throw new IndexOutOfBoundsException
    else if(n == 0) xs.head
    else nth(n - 1, xs.tail)
  }

  def singleton[T](elem: T) = new Cons[T](elem, new Nil[T])

  val list1 = singleton[Int](1)
  val list2 = singleton[Boolean](true)


  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))

  nth(0, list1)
  nth(0, list2)
  nth(2, list)
  nth(-1, list)
  nth(4, list)
}