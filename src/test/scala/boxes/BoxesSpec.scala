package boxes

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by salim on 04/11/2016.
  */
class BoxesSpec extends FlatSpec with Matchers {

  "Boxes" should "be buildable from a list" in {
    val _:LittleBoxes = List((1,1),(2,1),(1,2),(2,2))
  }

  it should "have an area" in {
    val b:LittleBoxes = List((1,1),(2,1))
    assert(b.area == 3)
  }

  it should "calculate the lower and upper bounds for the box search" in {
    val b:LittleBoxes = List((1,1),(2,1))
    assert(b.minH==2)
    assert(b.minW==1)

    assert(b.maxH==3)
    assert(b.maxW==2)
  }


  it should "be able to find all the big boxes that are worth checking" in {
    val b:LittleBoxes = List((1,1),(2,1))
    assert(b.possibleBoxes == Set(BigBox(3,1)))
  }

  it should "be able to find arrangements with more than one big box" in {
    val b:LittleBoxes = List((1,1),(1,1),(1,1),(1,1))
    assert(b.possibleBoxes == Set(BigBox(4,1),BigBox(2,2),BigBox(1,4)))
  }


}
