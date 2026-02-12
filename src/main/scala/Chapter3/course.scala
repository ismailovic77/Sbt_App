package Chapter3
import java.io._
import scala.util.Random

class Chapter_3 (val value : Int){

    def infix() : Any = {
        // all operators are methods 
        println( 1 + 2 ) // infix call
        println( 1 .+(2)) 
    }

    // if stataments

    def getConfigFilePath(path : String) : String = {
        val configFile = new File(path)
        val configFilePath = if (configFile.exists()) {
            configFile.getAbsolutePath()
        } else {
            configFile.createNewFile()
            configFile.getAbsolutePath()
        }
        configFilePath
    }

    def FilterBreeds(Breeds : List[String]) = {
        val FilteredBreeds = for {
            breed <- Breeds
            if breed.contains("Terrier")
            if !breed.contains("Yorkshire")
        } yield breed

        FilteredBreeds
    }
}

object PatternMatching {
    def matchOnValue(l : List[Any]) = {
        for (bool <- l){
            bool match{
                case true => println("this is true")
                case false => println("this is false")
                case _ => println("this is not true or false")
            }   
        }
    }

    def matchOnVariable() = {
        val randomInt = Random().nextInt(10)
        randomInt match {
            case 7 => println("the number is lucky seven")
            case other_number => println("Did not get seven , you got : " + other_number)
        }
    }

    def matchOnType() = {
        val l = List("ismail", 25 , 2.8 , false, true)
        for (elem <- l) {
            elem match {
                case i : Int => println("We got an integer , here is the value " + i)
                case s : String => println("we got a string , here is the value : "+ s)
                case d : Double => println("we got a double , here is the value : " + d)
                case c: Char => println("We got a char , here is the value : " + c)
                case other => println("we got something unexpected : "+ other) 
            }
        }
    }

    def matchOnList() = {
        val l1 = List(1,3,9,50)
        val l2 = List(10,35,3,5)
        val l3 = List()

        for (lst <- List(l1, l2, l3)) {
            val output = lst match {
                case List(_, 3, _, _) => "This is a good list , with 3 as the second element"
                case List(_*) => "this is not a good list"
            }
            println(output)
        }
    }
}