/**
  * Created by Administrator on 15/06/2017.
  */
abstract class Vehicle(){
  var id: Int = 1

  val model: String
  val reg: String
  var tyres: Int
  var colour: String
  var parts = scala.collection.mutable.ArrayBuffer.empty[Part]
}
