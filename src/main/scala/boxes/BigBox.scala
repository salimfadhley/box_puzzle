package boxes

/**
  * Created by salim on 05/11/2016.
  */
case class BigBox(h:Int, w:Int, littleBoxes:Map[(Int,Int),LittleBox]) extends boxy {
  def this(t:(Int,Int)) = this(t._1, t._2)

}
