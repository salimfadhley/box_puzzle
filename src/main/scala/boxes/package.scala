/**
  * Created by salim on 04/11/2016.
  */
package object boxes {


  implicit def lb(x:(Int,Int)) = LittleBox(x._2, x._1)
  implicit def lbs(x:List[(Int,Int)]):LittleBoxes = LittleBoxes(x.map(lb(_)))

}
