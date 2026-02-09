package Chapter3
import java.io._

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