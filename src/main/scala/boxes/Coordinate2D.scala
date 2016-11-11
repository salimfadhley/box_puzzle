package boxes

/**
  * Created by salim on 11/11/2016.
  */
case class Coordinate2D(x:Int, y:Int) {

  def + (c:Coordinate2D):Coordinate2D = Coordinate2D(c.x + x, c.y + y)

}


