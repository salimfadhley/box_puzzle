package boxes

/**
  * Created by salim on 05/11/2016.
  */
case class BigBox(w: Int, h: Int, littleBoxes: Map[Coordinate2D, LittleBox]) extends boxy {
  def this(h:Int, w:Int) = this(h,w, Map())
  def this(t:(Int,Int)) = this(t._1, t._2)

  def isFilled(x: (Int, Int)): Boolean = false


  def insertBox(coords:Coordinate2D, box:LittleBox): BigBox = {
    new BigBox(w, h, littleBoxes + (coords -> box))
  }

  def insertAnywhere(lb: LittleBox): BigBox = {
    ???
  }

  lazy val filled:Set[Coordinate2D] = {
    littleBoxes.flatMap{
      case (origin: Coordinate2D, lb: LittleBox) => lb.coords.map((d: Coordinate2D) => origin + d)
    }.toSet
}


object BigBox {

  def intersect(bb:BigBox, origin:Coordinate2D, lb:LittleBox):Set[Coordinate2D] = {
    littleBoxes.flatMap{
      case (origin: Coordinate2D, box: LittleBox) => box.coords.map(x => (origin + x))
    }
  }.toSet
  }
}