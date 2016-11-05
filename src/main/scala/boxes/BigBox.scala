package boxes

/**
  * Created by salim on 05/11/2016.
  */
case class BigBox(w: Int, h: Int, littleBoxes: Map[(Int, Int), LittleBox]) extends boxy {
  def this(h:Int, w:Int) = this(h,w, Map())
  def this(t:(Int,Int)) = this(t._1, t._2)

  def isFilled(x: (Int, Int)): Boolean = false


  def insertBox(coords:(Int,Int), box:LittleBox): BigBox = {

    BigBox(w, h, littleBoxes + (coords -> box))
  }

  def insertAnywhere(lb: LittleBox): BigBox = {
    ???
  }





}
