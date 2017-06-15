/**
  * Created by Administrator on 15/06/2017.
  */
class Car(val model: String,
          val reg: String,
          var tyres: Int,
          var colour: String,
          val doors: Int
         ) extends Vehicle() {
  override def toString: String = {
    s"ID: $id Model: $model. Registration Number: $reg. Number of Tyres: $tyres. Colour: $colour"
  }
}