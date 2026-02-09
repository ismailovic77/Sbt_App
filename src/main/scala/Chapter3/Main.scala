package Chapter3
import java.io._

object Main extends App {
    println("\n")
    println("***************** Chapter 3 ************")
    println("\n")

    val obj_chap3 = new Chapter_3(10)
    obj_chap3.infix()

    val configFilePath = obj_chap3.getConfigFilePath("src/main/scala/Chapter3/test.txt")
    println(configFilePath)
    
}
