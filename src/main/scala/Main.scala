/**
  * Created by Administrator on 15/06/2017.
  */
class Main {
  val vehicleArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Vehicle]
  val employeeArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Employee]
  val partArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Part]
  val r = scala.util.Random

  val garage = new Garage()

  val fanBelt = new Part("fanbelt")
  val screw = new Part("Screw")
  val gearbox = new Part("Gearbox")
  val exhaust = new Part("Exhaust")
  val key = new Part("Key")
  val transmission = new Part("Transmission")
  val fuelTank = new Part("Fuel Tank")
  val indicator = new Part("Indicators")
  val brakeLight = new Part("Brake Light")
  val battery = new Part("Battery")
  val suspension = new Part("Suspension")
  val filtration = new Part("Filtration")
  val brakes = new Part("Brakes")
  val pistonRing = new Part("Piston Ring")
  val sumpPlug = new Part("Sump Plug")
  val timingBelt = new Part("Timing Belt")
  val oilPump = new Part("Oil Pump")
  val turboCharger = new Part("Turbo Charger")
  val pulley = new Part("Pulley")
  val headBolt = new Part("Head Bolt")
  val fuelInjector = new Part("Fuel Injector")
  val starterMotor = new Part("Starter Motor")
  val alternator = new Part("Alternator")
  val rearAxle = new Part("Rear Axle")
  val spring = new Part("Spring")
  val catConverter = new Part("Catalytic Converter")
  val acceleratorCable = new Part("Accelerator Cable")
  val seat = new Part("Seat")
  val pedal = new Part("Pedal")
  val vacuumPump = new Part("Vacuum Pump")
  val calipers = new Part("Calipers")


  val employee1 = new Employee("Adam", "Dye", "15/02/1993", "808", "The Heart,", "Salford", "M50 T36", "adamdye@email.com", "07935378321", 101, "Director")

  val customer1 = new Customer("James", "Gallagher", "17/08/1995", "26", "Manc Road", "Manchester", "M06 L45", "jamesgallaghere@email.com", "0765287931", 236)

  val bike1 = new Bike("Yamaha M697", "YU65 M5G", 2, "Black")

  val car1 = new Car("Renault Clio", "JY15", 4, "Blue", 5)

  car1.parts.foreach(println)
  /*garage.addEmployee(employee1)

  garage.removeVehicleId(201)

  garage.removeVehicleType("Car")*/

  garage.repairVehicle(bike1)

  bike1.parts.foreach(println)

  garage.printContents()

  garage.open()
  println(garage.isOpen)
}
