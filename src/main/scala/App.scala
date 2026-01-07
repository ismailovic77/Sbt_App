object Main extends App {
  println( new optionalProjectUserInfo)
  println("this is the new line added ")
  println( new optionalProjectUserInfo(location = "lille"))
  println( new optionalProjectUserInfo(age = 35 , location = "Lille"))
}
object optionalProjectUserInfo {
  val unknownlocation = ""
  val unknownage = -1
  val unknownwebsite = ""
}

class optionalProjectUserInfo(
  location : String = optionalProjectUserInfo.unknownlocation,
  age : Int = optionalProjectUserInfo.unknownage,
  webSite : String = optionalProjectUserInfo.unknownwebsite
)

