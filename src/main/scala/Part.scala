/**
  * Created by Administrator on 15/06/2017.
  */
class Part(val name: String) extends Main {
  var price = 0
  var time = 0
  var isBroken: Boolean = false
  partArrayBuffer += this

  override def toString: String = {
    var printParts: String = s"Part Name: $name. Price: £$price. Time: $time hours."
    if (isBroken) {
      printParts += "This part is broken"
    }
    else {
      printParts +=  "This part is fixed"
    }
    return printParts
  }
}