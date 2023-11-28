//Author: Branden Purdum, coauthor: Robert Coleman

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

  
             