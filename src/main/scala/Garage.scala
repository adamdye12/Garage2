/**
  * Created by Administrator on 15/06/2017.
  */
class Garage(var isOpen: Boolean = false) {
  val vehicleArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Vehicle]
  val employeeArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Employee]
  val partArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Part]
  val r = scala.util.Random

  partArrayBuffer += new Part("fanbelt")
  partArrayBuffer += new Part("Screw")
  partArrayBuffer += new Part("Gearbox")
  partArrayBuffer += new Part("Exhaust")
  partArrayBuffer += new Part("Key")
  partArrayBuffer += new Part("Transmission")
  partArrayBuffer += new Part("Fuel Tank")
  partArrayBuffer += new Part("Indicators")
  partArrayBuffer += new Part("Brake Light")
  partArrayBuffer += new Part("Battery")
  partArrayBuffer += new Part("Suspension")
  partArrayBuffer += new Part("Filtration")
  partArrayBuffer += new Part("Brakes")
  partArrayBuffer += new Part("Piston Ring")
  partArrayBuffer += new Part("Sump Plug")
  partArrayBuffer += new Part("Timing Belt")
  partArrayBuffer += new Part("Oil Pump")
  partArrayBuffer += new Part("Turbo Charger")
  partArrayBuffer += new Part("Pulley")
  partArrayBuffer += new Part("Head Bolt")
  partArrayBuffer += new Part("Fuel Injector")
  partArrayBuffer += new Part("Starter Motor")
  partArrayBuffer += new Part("Alternator")
  partArrayBuffer += new Part("Rear Axle")
  partArrayBuffer += new Part("Spring")
  partArrayBuffer += new Part("Catalytic Converter")
  partArrayBuffer += new Part("Accelerator Cable")
  partArrayBuffer += new Part("Seat")
  partArrayBuffer += new Part("Pedal")
  partArrayBuffer += new Part("Vacuum Pump")
  partArrayBuffer += new Part("Calipers")

  def addVehicle(vehicle: Vehicle): Unit = {

    if (vehicleArrayBuffer.isEmpty) {
      vehicle.id = 1
    }
    else {
      vehicle.id = vehicleArrayBuffer.last.id + 1
    }
    vehicleArrayBuffer += vehicle
    vehicle.parts = partArrayBuffer
    vehicle.parts.foreach(x => {
      x.price = 10 + r.nextInt(40)
      x.time = 1 + r.nextInt(9)
      x.isBroken = math.random < 0.50
    })
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
      println(s"Vehicle ${vehicle.id} will take $hours hours and will cost £$price")
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
