package boxes

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by salim on 05/11/2016.
  */
class BoxySpec extends FlatSpec with Matchers {

  "boxy" should "have an iterable thing that produces coordinates" in {
    val b:BigBox = new BigBox(3,1)
    assert(b.coords.toSet == Set(Coordinate2D(0,0),Coordinate2D(1,0),Coordinate2D(2,0)))
  }

}
