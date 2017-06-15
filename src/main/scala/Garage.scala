/**
  * Created by Administrator on 15/06/2017.
  */
class Garage(var isOpen: Boolean = false) extends Main {

  def addVehicle(vehicle: Vehicle): Unit = {
    vehicleArrayBuffer += vehicle
  }

  def removeVehicleId(id: Int): Unit = {
    vehicleArrayBuffer.foreach(x => if (x.id == id) {
      vehicleArrayBuffer -= x
      return
    })
  }

  def removeVehicleType(vehicleType: String) = vehicleType match {
    case "Car" => vehicleArrayBuffer.foreach(x => if (x.isInstanceOf[Car]) vehicleArrayBuffer -= x)
    case "Bike" => vehicleArrayBuffer.foreach(x => if (x.isInstanceOf[Bike]) vehicleArrayBuffer -= x)
    case _ => println("Please remove either a car or a bike.")
  }

  def repairVehicle(vehicle: Vehicle): Unit = {
    var price: Int = 0
    var hours: Int = 0
    vehicle.parts.foreach(x => {
      if (x.isBroken) {
        price += x.price
        hours += x.time
        x.isBroken = false
      }
    })
    println(s"This vehicle will take $hours hours and will cost £$price")
  }

  def addEmployee(employee: Employee): Unit = {
    employeeArrayBuffer += employee
  }

  def open(): Unit = {
    this.isOpen = true
  }

  def close(): Unit = {
    this.isOpen = false
  }

  def printContents(): Unit = {
    if (vehicleArrayBuffer.isEmpty) println("No vehicles in garage.")
    else
      println("Vehicles:")
    vehicleArrayBuffer.foreach(println)

    if (employeeArrayBuffer.isEmpty) println("No employees in garage.")
    else
      println("Employees:")
    employeeArrayBuffer.foreach(println)
  }
}
