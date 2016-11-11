package boxes

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by salim on 11/11/2016.
  */
class Coordinate2DSpec extends FlatSpec with Matchers {

  "Coordinate2D" can "be created from a tuple" in {
    val c:Coordinate2D = (1,1)
  }

  it can "be added to another coordinate" in {
    val expected:Coordinate2D = (1,1)
    val c0:Coordinate2D = (2,2)
    val c1:Coordinate2D = (-1,-1)

    assert(c0 + c1 == expected)

  }

}
