package Chapter2

import java.io._

class Chapter_2 {
    def factorial(n:Int) : Int = {
        if n == 0 then
            1
        else
            n * factorial(n-1)
    }
    def tuple_constuct(x:Int, y:String, z:Boolean) = (x, y, z)

    //Options , Some , None

    object opt_some {

        val CountriesCapital : Map[String, String]= Map(
            "Maroc" -> "Rabat",
            "Tunisie" -> "Tunis",
            "France" -> "Paris"
        )

        def toOpt(input_feild: String) : Option[String] = Option(input_feild).filter(_.nonEmpty)

    }   
}

abstract class BulkReader[In] {
    val source : In
    def read: String
}

class StringBulkReader(val source: String) extends BulkReader[String] {
    def read: String = source
}

class FileBulkReader(val source: File) extends BulkReader[File] {
    def read: String = {
        val in = new BufferedInputStream(new FileInputStream(source))
        val numBytes = in.available()
        val bytes = new Array[Byte](numBytes)
        in.read(bytes, 0, numBytes)
        new String(bytes)
    }
}