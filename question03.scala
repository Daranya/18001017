package Q3

object question03
{

  def wholesaleCost(num: Int): Unit =
  {
    var price:Double = num * 24.95
    var shipcost: Double= 0
    println("Original Price Rs.= " + price)
    var discount: Double= price * 40 / 100
    println("Discount Rs.= " +discount)
    if (num <= 50)
      shipcost = num * 3
    else
      shipcost = 50 * 3 + (num - 50) *0.75
    println("Shipping cost = Rs." + shipcost)
    var wholecost: Double = price-discount+shipcost
    println("Wholesale cost = Rs." + wholecost)
  }

  def main(args: Array[String]): Unit =
  {
    println("Enter the number of Copies: ")
    var num = scala.io.StdIn.readInt()
    wholesaleCost(num)
  }

}
