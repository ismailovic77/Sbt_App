package shapes {
    import scala.actors._
    import scala.actors.Actor._

    abstract class Shape() {
        def draw(): Unit
    }

    class Point(val x: Double , val y: Double){
        override def toString(): String = "Point(" + x + "," + y + ")"
    }

    class Center(val center: Point , val radius: Double) extends Shape {
        def draw() = Console.println("Drawing the cirle" + this)
        override def toString(): String = {
            "Circle(" + center + "," + radius + ")" 
        }
    }

    class Rectangle(val LowerPoint: Point, val height: Double, val width: Double) extends Shape {
        def draw() = Console.println("Drawing the rectangle : " + this)
        override def toString(): String = {
            return "Rectangle(" + LowerPoint + "," + height + "," + width + ")"
        }
    }

    class Triangle(val point1: Point , point2: Point , point3: Point) extends Shape{
        def draw() = Console.println("Drawing the Triangle : " + this)
        override def toString(): String = {
            return "Triangle(" + point1 + "," + point2 + "," + point3 + ")"
        }
    }

    object DrawingShapeActor extends Actor {
        def act() = {
            loop {
                receive {
                    case s: Shape => s.draw()
                    case "exit" => println("exiting ....");exit
                    case x: Any => println("Error unknown Message : " + x)
                }
            }
        }
    }
}
