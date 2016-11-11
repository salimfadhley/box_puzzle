package boxes

/**
  * Created by salim on 05/11/2016.
  */
trait boxy {
  val w:Int
  val h:Int
  lazy val maxX = w - 1
  lazy val maxY = h - 1
  def area:Int = h*w
  def coords:Seq[Coordinate2D] = for(hh <- 0 to maxX; ww <- 0 to maxY) yield Coordinate2D(hh,ww)
}
