//Authors: Branden Purdum and Robert Coleman

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

  
             