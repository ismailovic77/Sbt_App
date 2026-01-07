package shapes 
    
import akka.actor.{Actor, ActorSystem, Props}

abstract class Shape() {
    def draw(): Unit
}

class Point(val x: Double , val y: Double){
    override def toString(): String = "Point(" + x + "," + y + ")"
}

class Circle(val center: Point , val radius: Double) extends Shape {
    def draw() = Console.println(" Drawing the cirle " + this)
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

class Triangle(val point1: Point , val point2: Point , val point3: Point) extends Shape{
    def draw() = Console.println("Drawing the Triangle : " + this)
    override def toString(): String = {
        return "Triangle(" + point1 + "," + point2 + "," + point3 + ")"
    }
}

class DrawingShapeActor extends Actor {
    override def receive: Receive = {
        case s: Shape =>s.draw()

        case "exit" =>
        println("exiting ....")
        context.system.terminate()   // Akka replacement for exit()

        case x => println(s"Error unknown Message: $x")
    }
}

object DrawingShapeActor {
    def props = Props[DrawingShapeActor]()
}

