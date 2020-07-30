package new02

object rational_sub
{
    def main(args:Array[String]):Unit=
    {
      println("Enter the values of Numerator and Denominator:")
      val n1=scala.io.StdIn.readInt()
      val d1=scala.io.StdIn.readInt()
      val x=new Rational(n1,d1)
      println("Enter the values of Numerator and Denominator:")
      val n2=scala.io.StdIn.readInt()
      val d2=scala.io.StdIn.readInt()
      val y=new Rational(n2,d2)
      println("Enter the values of Numerator and Denominator:")
      val n3=scala.io.StdIn.readInt()
      val d3=scala.io.StdIn.readInt()
      val z=new Rational(n3,d3)
      println("The rational numbers you entered: "+x+" , "+y)
      println("After subtraction: "+x.sub(y).sub(z))
    }

    class Rational(n:Int,d:Int)
    {
      require(d!=0,"Denominator cannot be zero")
      def numer: Int=n
      def denom=d
      def add(r:Rational): Rational=new Rational(numer*r.denom+r.numer*denom,denom*r.denom)
      def+(r:Rational):Rational=add(r)
      def neg=new Rational(-this.numer,this.denom)
      def sub(r:Rational): Rational= add(r.neg)
      override
      def toString=numer+"/"+denom
    }
}
