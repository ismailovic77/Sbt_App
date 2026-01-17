package Chapter2
import java.io._

object Main extends App {
  println("start the first app")
  val chap2 = new Chapter_2()
  val factorial : Int = chap2.factorial(6)
  println(factorial)

  val t = chap2.tuple_constuct(1, "Ismail", true)
  val (t1, t2, t3) = chap2.tuple_constuct(1, "Ismail", true)
  println(t2)

  val CountriesCapital = chap2.opt_some.CountriesCapital

  println("********************************************")
  println("\n")
  println("Maroc : " + CountriesCapital.get("Maroc"))
  println("Tunisie : " + CountriesCapital.get("Tunisie"))
  println("France : " + CountriesCapital.get("France"))
  println("Algerie : " + CountriesCapital.get("Algerie"))
  println("\n")

  println("\n")
  println("Maroc : " + CountriesCapital.get("Maroc").get)
  println("Tunisie : " + CountriesCapital.get("Tunisie").getOrElse("Unkown Capital"))
  println("France : " + CountriesCapital.get("France").getOrElse("Unkown Capital"))
  println("Algerie : " + CountriesCapital.get("Algerie").getOrElse("Unkown Capital"))
  println("\n")

  val input_email : List[String] = List("ismail@gmail.com", null, "", "true@email.com")
  val emails : List[Option[String]]= input_email.map((x: String) => chap2.opt_some.toOpt(x))
  println(emails)
  emails.foreach(email => println(email.getOrElse("Unknown")))

  println("************* Abstract and parametrized classes ************")

  println( new StringBulkReader("Hello from the string reader function").read)
  println( new FileBulkReader(new File("src/main/scala/Chapter2/test.txt")).read)
}
