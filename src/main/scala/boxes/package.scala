/**
  * Created by salim on 04/11/2016.
  */
package object boxes {

  implicit def c2d(x:(Int, Int)):Coordinate2D = Coordinate2D(x._1, x._2)
  implicit def lb(x:(Int,Int)):LittleBox = LittleBox(x._2, x._1)
  implicit def lbs(x:List[(Int,Int)]):LittleBoxes = LittleBoxes(x.map(lb(_)))

}
