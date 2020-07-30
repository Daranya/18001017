package new04

object bank_list
{
    def main(args:Array[String]):Unit=
    {
      println("Input Format")
      println("nic")
      println("account number")
      println("balance")
      println("Data types: nic -> String, account number -> Integer, Balance -> Double")

      println("Enter first data set")

      val id = scala.io.StdIn.readLine()
      val n = scala.io.StdIn.readInt()
      val b = scala.io.StdIn.readDouble()
      val x = new Account(id:String, n: Int, b: Double)

      println("Enter second data set")

      val id2 = scala.io.StdIn.readLine()
      val n2 = scala.io.StdIn.readInt()
      val b2 = scala.io.StdIn.readDouble()
      val y = new Account(id2: String, n2: Int, b2: Double)

      println("Enter third data set")

      val id3 = scala.io.StdIn.readLine()
      val n3 = scala.io.StdIn.readInt()
      val b3 = scala.io.StdIn.readDouble()
      val z = new Account(id3: String, n3: Int, b3: Double)

      println("Enter fourth data set")

      val id4 = scala.io.StdIn.readLine()
      val n4 = scala.io.StdIn.readInt()
      val b4 = scala.io.StdIn.readDouble()
      val p = new Account(id4: String ,n4: Int, b4: Double)

      println("Enter fifth data set")

      val id5 = scala.io.StdIn.readLine()
      val n5 = scala.io.StdIn.readInt()
      val b5 = scala.io.StdIn.readDouble()
      val q = new Account(id5:String ,n5: Int, b5: Double)

      var bank: List[Account] = List(x, y, z, p, q)

      println("Enter the account number you need to find the balance of: ")

      val acnumber = scala.io.StdIn.readInt()
      val find = (n: Int, b: List[Account]) => b.filter(x => x.acnumber.equals(n))
      val ans = find(acnumber, bank)
      println(ans)

      val overdraft = (b: List[Account]) => b.filter(x => x.balance.<(0))
      val ans2 = overdraft(bank)
      println("The bank account with negative balance: " + ans2)

      val balance=(b:List[Account])=>b.map(_.balance).sum
      val ans3=balance(bank)
      println("The sum of all the balances in the bank: "+ans3)

      /*val interest = (b: List[Account]) => b.map()
      val ans4 = interest(bank)
      println("The final balance: "+ans4)*/
    }

    class Account(id:String, n:Int, b:Double)
    {
      val nic:String=id
      val acnumber:Int=n
      var balance:Double=b
      override def toString=nic+" : "+acnumber+" : "+balance
    }
}

/*Sample Data Set

97345764V
1
1000

*/