package boxes

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by salim on 05/11/2016.
  */
class BigBoxSpec extends FlatSpec with Matchers {

  "BigBox" can "be created" in {
    val bb:BigBox = new BigBox(10,10)
    assert(bb.h == 10)
  }

  it can "have a little box inserted" in {
    val bb0:BigBox = new BigBox(10,10)
    val bb1:BigBox = bb0.insertBox((2,2),box=LittleBox(2, 2))

    val filled = bb1.coords.filter((x) => bb1.isFilled(x)).toSet


  }

}
