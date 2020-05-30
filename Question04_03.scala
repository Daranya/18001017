package Question4

object Question04_03
{
  def oddOrEven(n:Int): Unit =
  {
    if(n==0)
      println("Even")
    else if(n==1)
      println("Odd")
    else
      return oddOrEven(n-2)
  }
  def main(args: Array[String]): Unit=
  {
    while(true)
    {
     println("Enter a number: ")
     var num: Int = scala.io.StdIn.readInt()
     oddOrEven(num)
    }
  }
}
