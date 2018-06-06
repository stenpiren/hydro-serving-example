package RRCF

case class DataPoint(array: Array[Double]) {
  override def equals(obj: scala.Any): Boolean = {
    obj match {
      case dp: DataPoint => this.array.sameElements(dp.array)
      case _ => false
    }
  }

  override def toString: String = array.mkString(" ")
}