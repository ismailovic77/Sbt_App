class MathLib {
    def factorial(n:Int) : Int = {
        if n == 0 then
            1
        else
            n * factorial(n-1)
    }
    def tuple_constuct(x:Int, y:String, z:Boolean) = (x, y, z)
}