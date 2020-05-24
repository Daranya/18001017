package Q1

object question01
{
  def convertTemperature(c: Double)
  {
    var f: Double=c*1.8000+32.00
    println("The converted Temperature = "+f+" Degree Fahrenheit")
  }
  def main(args: Array[String]): Unit =
    {
      println("Enter the Celcius value: ")
      var cel_val: Double=scala.io.StdIn.readDouble()
      convertTemperature(cel_val)
    }
}
