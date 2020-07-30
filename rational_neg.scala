package new01

object rational_neg
{
    def main(args:Array[String]):Unit=
    {
      println("Enter the values of Numerator and Denominator:")
      val n=scala.io.StdIn.readInt()
      val d=scala.io.StdIn.readInt()
      val x=new Rational(n,d)
      println("The rational number you entered: "+x)
      println("The negation: " +x.neg)
    }


    class Rational(n:Int,d:Int)
    {
      require(d!=0,"Denominator cannot be zero")
      def numer: Int=n
      def denom=d
      def neg=new Rational(-this.numer,this.denom)
      override
      def toString=numer+"/"+denom

    }
}
