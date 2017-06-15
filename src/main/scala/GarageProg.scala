/**
  * Created by Administrator on 15/06/2017.
  */
object GarageProg {
  def main(args: Array[String]): Unit = {

    val garage = new Garage()

    val employee1 = new Employee("Adam", "Dye", "15/02/1993", "808", "The Heart,", "Salford", "M50 T36", "adamdye@email.com", "07935378321", 101, "Director")

    val customer1 = new Customer("James", "Gallagher", "17/08/1995", "26", "Manc Road", "Manchester", "M06 L45", "jamesgallaghere@email.com", "0765287931", 236)

    val bike1 = new Bike("Yamaha M697", "YU65 M5G", 2, "Black")

    val car1 = new Car("Renault Clio", "JY15", 4, "Blue", 5)

    garage.addVehicle(car1)

    car1.parts.foreach(println)

    println

    garage.repairVehicle(car1)

    println()

    garage.addVehicle(bike1)

    bike1.parts.foreach(println)

    garage.repairVehicle(bike1)
   /* println
    garage.repairVehicle(bike1)
    car1.parts.foreach(println)*/

      /*garage.addEmployee(employee1)

      garage.removeVehicleId(201)

      garage.removeVehicleType("Car")*/

      //garage.repairVehicle(bike1)

      //garage.printContents()

    //garage.open()
    //println(garage.isOpen)
  }
}



