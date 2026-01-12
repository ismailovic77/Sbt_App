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
}
