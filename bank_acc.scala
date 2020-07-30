package new03

object bank_acc
{
  def main(args:Array[String]):Unit=
  {
    println("Enter account number and balance: ")
    val n=scala.io.StdIn.readInt()
    val b=scala.io.StdIn.readDouble()

    println("Enter the second account number and balance: ")
    val n2=scala.io.StdIn.readInt()
    val b2=scala.io.StdIn.readDouble()
    println("Enter the amount to transfer: ")
    val amt=scala.io.StdIn.readInt()
    val x=new Account(n:Int,b:Double)
    val y=new Account(n2:Int,b2:Double)
    println(x+"  "+y)
    trans(x,y,amt)
    println(x+"  "+y)
  }
  class Account(n:Int,b:Double)
  {
    val acnumber:Int=n
    var balance:Double=b
    def withdraw(a:Double)=this.balance=this.balance-a
    def deposit(a:Double)=this.balance=this.balance+a
    override def toString= acnumber+" : "+balance
  }
  def trans (a:Account,b:Account,amt:Double ): Unit =
  {
    a.withdraw(amt)
    b.deposit(amt)
  }

}
