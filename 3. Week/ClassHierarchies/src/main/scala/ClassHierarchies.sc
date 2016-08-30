object ClassHierarchies {
  abstract class IntSet {
    def incl(x: Int): IntSet
    def contains(x: Int): Boolean
    def union(other: IntSet): IntSet
  }

  class Empty extends IntSet {
    def contains(x: Int): Boolean = false
    def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)
    def union(other: IntSet): IntSet = other

    override def toString = "."
  }

  class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
    def contains(x: Int): Boolean = {
      if(x < elem) left contains x
      else if(x > elem) right contains x
      else true
    }

    def incl(x: Int): IntSet = {
      if(x < elem) new NonEmpty(elem, left incl x, right)
      else if(x > elem) new NonEmpty(elem, left, right incl x)
      else this
    }

    def union(other: IntSet): IntSet = {
      ((left union right) union other) incl elem
    }

    override def toString = "{" + left + elem + right + "}"
  }


  // test
  val t1 = new NonEmpty(6, new Empty, new Empty)
  val t2 = t1.incl(5)
  val t3 = t2.incl(7)
  val t4 = t3.incl(8)

  val t5 = t4.union(new NonEmpty(4, new Empty, new Empty))
  val t6 = t4.union(new NonEmpty(5, new Empty, new Empty))

  val p1 = new NonEmpty(10, new Empty, new Empty)
  val p2 = p1.incl(2)

  val z3 = t5.union(p2)
}
