/**
  * Created by Administrator on 15/06/2017.
  */
abstract class Vehicle()extends Main{
  var id: Int = 1
  if (vehicleArrayBuffer.isEmpty) {
    id = 1
  }
  else {
    id = vehicleArrayBuffer.last.id + 1
  }
  val model: String
  val reg: String
  var tyres: Int
  var colour: String
  var parts = scala.collection.mutable.ArrayBuffer.empty[Part]
  parts = partArrayBuffer
  parts.foreach(x => {
    x.price = 10 + r.nextInt(40)
    x.time = 1 + r.nextInt(9)
    x.isBroken = math.random < 0.50
  })

  garage.addVehicle(this)
}
