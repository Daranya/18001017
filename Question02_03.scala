package Question2

object Question02_03
{
  def primeOrNot(v:Int,i:Int):Boolean=
  {
    var tf: Boolean=true
    if(v==1)
    {
      tf=false
    }
    else if(i==1)
      tf=true
    else
    {
      if(v%i==0)
        tf=false
      else
        return primeOrNot(v,i-1)
    }
    return tf
  }
  def primeSeq(n:Int): Unit =
  {
    var i: Int = 2
    for (i <- 2 to n-1)
      if (primeOrNot(i,i / 2))
        println(i)
  }
  def main(args: Array[String]): Unit =
  {
    println("Enter a num: ")
    var num:Int=scala.io.StdIn.readInt()
    println("Prime numbers less than "+num)
    primeSeq(num)
  }
}
