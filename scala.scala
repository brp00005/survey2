//Authors: Branden Purdum and Robert Coleman
object Main extends App {
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

  // Example usage:
  val result = same(List(1, 2, 3), List(1, 2, 3))
  println(result)
}

// This is the end of the main code.





//import unit test stuff
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers._

class scala extends AnyFunSpec{
  //unit tests
  describe("same"){

    //unit test 1
    it("recursively compare [1, 2, 8], [1, 2, 8]"){
      val result = same([1, 2, 8], [1, 2, 8])
      result shouldEqual true
    }
    //unit test 2
    it("recursively compare [1, 2, 2], [1, 2, 8]"){
      val result = same([1, 2, 2], [1, 2, 8])
      result shouldEqual false
    }

    //unit test 3, null numbers edge case
    it("recursively compare [], [1, 2, 8]"){
      val result = same([], [1, 2, 8])
      result shouldEqual false
    }

    //unit test 4, null null edge case
    it("recursively compare [], []"){
      val result = same([], [])
      result shouldEqual false
    }
  }


  //function definition and whatnot
  def same(list1: List[int], list2: List[int]): Boolean{
    //base cases: null null list, then only 1 null List


    //recursive call, if one is not equal, false 

  }
}

  
             
