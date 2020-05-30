package question01

object Question01_02
{
  def calculateSalary(wh:Float,ot:Float): Float =
  {
    println("Normal working hours salary: Rs."+(150*wh))
    println("OT hours salary: Rs."+(75*ot))
    var total_salary: Float=150*wh+75*ot
    return(total_salary)
    //println("Take home salary: "+total_salary)
  }
  def main(args: Array[String]): Unit =
  {
    println("Enter the number of working hours: ")
    var w_hrs: Float=scala.io.StdIn.readFloat()
    println("Enter the number of OT hours: ")
    var OT_hrs: Float=scala.io.StdIn.readFloat()
    var salary: Float=calculateSalary(w_hrs,OT_hrs)
    println("Take home salary: Rs."+salary)
  }
}
