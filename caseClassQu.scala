package new04

object caseClassQu
{
  case class Point(a: Int, b: Int) {
    var x: Int = a
    var y: Int = b

    def add(r:Point): Point=Point(x+r.x,y+r.y)
    def move(r:Point): Point=(add(r))
    def invert = Point(this.y, this.x)
    def sqr_add(r:Point): Point=Point((x-r.x)*(x-r.x),(y-r.y)*(y-r.y))//add the squared values of x and y. ie.x^2+y^2
    def simple_add=(this.y+this.x) //add(x+y of a coordinate
    def distance(r:Point)=
      {
        math.sqrt(sqr_add(r).simple_add)
      }:Double
  }
  def main(args:Array[String]):Unit= {
    while (true)
    {
      println("Enter every input one after the other")
      println(" Type 0 0 to add two points")
      println(" Type 0 1 to move a point")
      println(" Type 1 0 to find the distance between two points")
      println(" Type 1 1 to invert a point's coordinate")

      println("Enter the choice in the form 'x' Enter 'y': ")

      val x3 = scala.io.StdIn.readInt()
      val y3 = scala.io.StdIn.readInt()
      val pt3 = Point(x3, y3) match {
        case Point(0, 0) =>
          println("Enter the first coordinate ('x' Enter 'y'): ")
          val x1 = scala.io.StdIn.readInt()
          val y1 = scala.io.StdIn.readInt()
          val pt1 = Point(x1, y1)

          println("Enter the second coordinate ('x' Enter 'y'): ")
          val x2 = scala.io.StdIn.readInt()
          val y2 = scala.io.StdIn.readInt()
          val pt2 = Point(x2, y2)

          println("Answer: " + pt1.add(pt2))

        case Point(0, 1) =>

          println("Enter the coordinate ('x' Enter 'y'): ")
          val x1 = scala.io.StdIn.readInt()
          val y1 = scala.io.StdIn.readInt()
          val pt1 = Point(x1, y1)

          println("Enter how much you want to move each coordinate ('dx' Enter 'dy'): ")
          val dx = scala.io.StdIn.readInt()
          val dy = scala.io.StdIn.readInt()
          val pt2 = Point(dx, dy)

          println("Answer: " + pt1.move(pt2))

        case Point(1, 0) =>

          println("Enter the first coordinate ('x' Enter 'y'): ")
          val x1 = scala.io.StdIn.readInt()
          val y1 = scala.io.StdIn.readInt()
          val pt1 = Point(x1, y1)

          println("Enter the second coordinate ('x' Enter 'y'): ")
          val x2 = scala.io.StdIn.readInt()
          val y2 = scala.io.StdIn.readInt()
          val pt2 = Point(x2, y2)

          println("Answer: " + pt1.distance(pt2))

        case Point(1, 1) =>

          println("Enter the coordinate ('x' Enter 'y'): ")
          val x1 = scala.io.StdIn.readInt()
          val y1 = scala.io.StdIn.readInt()
          val pt1 = Point(x1, y1)

          println("Answer: " + pt1.invert)
      }
    }
  }
}
