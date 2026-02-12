package Chapter3
import java.io._
import java.util.Calendar

object Main extends App {
    println("\n")
    println("***************** Chapter 3 ************")
    println("\n")

    val obj_chap3 = new Chapter_3(10)
    obj_chap3.infix()

    val configFilePath = obj_chap3.getConfigFilePath("src/main/scala/Chapter3/test.txt")
    println(configFilePath)

    val dogsBreeds = List("Doberman", "Yorkshire Terrier", "Dachshund", "Scottish Terrier", "Great Dane", "Portuguese Water Dog")

    // For loop with filtering 
    for (breed <- dogsBreeds 
        if breed.contains("Terrier")
        if !breed.contains("Yorkshire")
    ) println(breed)

    val FilterBreeds = obj_chap3.FilterBreeds(dogsBreeds)
    println(FilterBreeds)

    val UpperCaseBreeds = dogsBreeds.map((x) => x.toUpperCase())
    println(UpperCaseBreeds)

    // Generator Expressions 
    for (i <- 1 to 10 ) print(i) // includes 10
    println("")
    for (i <- 1 until 10 ) print(i) // does not include 10
    println("")


    // pattern matching
    println("")
    println("*********** start on pattern matching **************")
    println("")
    val l = List(true, false , "test")
    PatternMatching.matchOnValue(l)
    PatternMatching.matchOnVariable()
    PatternMatching.matchOnList()
    PatternMatching.matchOnType()

    println("")
    println("*********** Try catch  **************")
    println("")

    val Then = null
    val now = Calendar.getInstance()

    try {
        now.compareTo(Then)
    } catch {
        case e: NullPointerException => println("One was null "); System.exit(-1)
        case unknown => println("Unknown eexceprion : " + unknown);System.exit(-1)
    } finally {
        println("it all worked out ")
        System.exit(0)
    }

}
