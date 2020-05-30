package Question5

object Question05_03
{
  def addEven(n:Int): Int =
  {
    var sum:Int=0
    if(n==2||n==0)
      return n
    else if(n==1)
      return 0
    if(n%2==0)
      {
        sum=n+addEven(n-2)
        return sum
      }
    else
      {
        sum=addEven(n-1)
        return sum
      }

  }
  def main(args: Array[String]): Unit =
  {
    println("Enter a number: ")
    var num:Int=scala.io.StdIn.readInt()
    var ans:Int=addEven(num)
    println("The sum of even numbers less than "+num+" = "+ans)
    if(num%2==0)
      println("Sum without adding "+num+" = "+(ans-num))
  }
}
