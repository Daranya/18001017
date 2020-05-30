package Question6

object Question06_03
{
  def fibonacci(n:Int):Int=
  {
    if (n == 0)
      return 0
    else if (n == 1)
      return 1
    else
      return fibonacci(n - 1) + fibonacci(n - 2)
  }
def main(args: Array[String]): Unit =
  {
    println("Enter the num: ")
    var num:Int=scala.io.StdIn.readInt()
    println("The first "+num+" finonacci numbers")
    var a:Int=1
    for(a<- 1 to num)
      {
        var ans:Int=fibonacci(a)
        printf("\t"+ans)
      }
  }
}
