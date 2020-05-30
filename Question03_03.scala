package Question3

object Question03_03
{
  def addNum(n:Int): Int=
  {
    var sum:Int=0
    if(n<=1)
      return n
    sum=n+addNum(n-1)
    return sum
  }

def main(args: Array[String]): Unit =
  {
    println("Enter a number: ")
    var num: Int=scala.io.StdIn.readInt()
    var ans:Int=addNum(num)
    println("The sum of numbers from 1 to "+num+" = "+ans)
  }
}
