//Authors: Branden Purdum and Robert Coleman
//Statement: This code follows the academic integrity policy

import org.scalatest.funsuite.AnyFunSuite

//make stuff for tests 
object TestRunner {
  def main(args: Array[String]): Unit = {
    
    //instantiate object and run tests 
    val testSuite = new TestSuite
    testSuite.execute()
  }
}

//same function and unit tests
class TestSuite extends AnyFunSuite {
  def same[A](list1: List[A], list2: List[A]): Boolean = {
    (list1, list2) match {
      case (Nil, Nil) => true
      case (Nil, _) => false
      case (_, Nil) => false
      case (head1 :: tail1, head2 :: tail2) if head1 == head2 =>
        same(tail1, tail2)
      case _ => false
    }
  }

  test("Test edge cases: ") {
    assert(same(List(), List(1, 2, 3)) == false)
    assert(same(List(1, 2, 3), List()) == false)
    assert(same(List(), List()) == true)
  }

  test("Test non-trivial cases: ") {
    assert(same(List(1,2,4), List(1, 2, 3)) == false)
    assert(same(List(1, 2, 3), List(1,2,3)) == true)
    assert(same(List(3,2,1,5), List(3,2,1,1)) == false)
    assert(same(List(3,2,1,5), List(3,2,1,5)) == true)
  }
}    
