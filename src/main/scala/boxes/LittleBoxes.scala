package boxes

/**
  * Created by salim on 04/11/2016.
  */
case class LittleBoxes(littleBoxes:List[LittleBox]) {
  def area = littleBoxes.map(_.area).sum
  def minH = littleBoxes.map(_.h).max
  def minW = littleBoxes.map(_.w).max
  def maxH = math.ceil(area / minW.toDouble).toInt
  def maxW = math.ceil(area / minH.toDouble).toInt
  def possibleBoxes:Set[BigBox] = (minH to maxH).flatMap(x => (minW to maxW).map(y => BigBox(x, y))).filter((b)=>b.area==area).toSet
}
