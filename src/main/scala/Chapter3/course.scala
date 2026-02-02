package Chapter3

class Chapter_3 (val value : Int){

    def infix() : Any = {
        // all operators are methods 
        println( 1 + 2 ) // infix call
        println( 1 .+(2)) 
    }

    def add(x: Int) = {
        value + x
    }


}