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
}
