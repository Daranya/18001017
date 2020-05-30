package Question02

object Question02_02
{
  def printBest(highPro:Int,bestPri:Int,bestNo:Int): Unit =
  {
    println("The highest profit in the list is "+highPro)
    println("Highest profit is gained when the tikcet price is Rs."+bestPri)
    println("Average attendance on this incident is "+bestNo)
  }
  def printProfits(price:Int,num:Int): Unit =
  {
    var profit:Int=0
    var highPro:Int=0
    var bestPri:Int=0
    var bestNo:Int=0
    var n:Int=num
    println("Price\t\tPeople\t\tProfit")
    for(price<- 0 to 9)
    {
      profit=(((price*5)-3)*n)-500
      println(price*5+"\t\t\t"+n+"\t\t\t"+profit)
      n=n-20
      if(profit>highPro)
      {
        highPro=profit
        bestPri=price*5
        bestNo=n
      }
    }
    printBest(highPro,bestPri,bestNo)
  }

  def main(args: Array[String]): Unit=
    {
      var price:Int=0
      var num:Int=180
      printProfits(price,num)
    }
}
