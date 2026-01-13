object Main extends App {
  println("start the first app")
  val mathlib = new MathLib()
  val factorial : Int = mathlib.factorial(6)
  println(factorial)

  val c1: Char = 'B'
  println(c1)
  val c2: Char = 66.toChar
  println(c2)
  val c3: Char = '\u0041'
  println(c3)

  val S:String = " Programming\nScala "
  println(S)
  val S2: String = """ Programmnig\nScala"""

  val t = mathlib.tuple_constuct(1, "Ismail", true)
  val (t1, t2, t3) = mathlib.tuple_constuct(1, "Ismail", true)
  println(t2)

  //Options , Some , None

  val CountriesCapital : Map[String, String]= Map(
    "Maroc" -> "Rabat",
    "Tunisie" -> "Tunis",
    "France" -> "Paris"
  )

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
  def toOpt(input_feild: String) : Option[String] = Option(input_feild).filter(_.nonEmpty)
  val emails : List[Option[String]]= input_email.map((x: String) => toOpt(x))
  
  emails.foreach(email => println(email.getOrElse("Unknown")))
}
