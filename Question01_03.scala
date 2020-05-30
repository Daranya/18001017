package Question1

object Question01_03
{
  def prime(v:Int,i: Int): Boolean =
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
          return prime(v,i-1)
      }
      return tf
    }
  def main(args: Array[String]): Unit=
  {
    {
      while (true)
      {
        println("Enter the vlaue: ")
        var value: Int = scala.io.StdIn.readInt()
        var ans: Boolean = prime(value,value/2)
        println(ans)
      }
    }
  }
}

