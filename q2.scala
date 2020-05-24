package Q2

object question02
{
  def volumeofSphere(radius: Double): Unit =
    {
      var volume: Double=4*math.Pi*radius*radius*radius/3
      printf("Volume = "+volume)
    }
  def main(args: Array[String]): Unit =
    {
      println("Enter the radius: ")
      var radius:Double=scala.io.StdIn.readDouble()
      volumeofSphere(radius)
    }
}
