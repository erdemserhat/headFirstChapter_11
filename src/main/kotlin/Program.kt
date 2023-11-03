fun main(args:Array<String>) {

    val adder = { x: Int -> x + 5 } //f(x) = x+5
    adder.invoke(10) // f(10) = 15
    val str = { "pow" } // no parameter f =  pow

    val addInts = { x: Int, y: Int -> x + y } //f(x,y) = x+y
    val result = addInts.invoke(10, 15)// result = f(10,15) = 25
    println(result)

    //Note:Pass arguments in orders...
    val stringPrinter = { a: String, b: String -> a + " x " + b }
    println(stringPrinter("serhat", "erdem"))

    /**
     * Just like any other sort of object, a lambda has a type.
     * The difference with a lambda's type, however, is that it doesn't
     * specify a class name that the lambda implements.Instead ;
     * It specifies the type of the lambda's parameters and return value.
     *
     * A lambda's type is also known as a function type.
     * A lambda's type takes the form:
     * (parameters)->return_value
     *
     * So if you have a lambda with a single Int parameter returns a String
     * like this :
     * v
     * val msg = {x:Int -> "The value is $x"
     * its type is:
     * (Int) -> String
     */

    //How to initialize a lambda expression lately

    val greeting: () -> String = { "hello" }

    val mySpecialFun: (Double, Double) -> Double
    mySpecialFun = { x, y -> Math.sqrt(x * y) }
    println(mySpecialFun.invoke(10.0, 10.0))

    //If you have a single parameter, you can use "it" keyword

    //Instead of this,
    val addSix: (Int) -> Int = { x: Int -> x + 6 }

    //You can do this;

    val addSixx: (Int) -> Int = { it + 5 }

    /**
     * In the above code, { it + 5 } is equivalent to  { x -> x + 5 }
     * but it' much more concise.
     */

    //You must care about lambda's type;

    var xOperation: (x: Double, y: Double) -> Double = { x, y -> Math.sqrt(x + y) }
    //(Double, Double) -> Double is xOperation's type

    //xOperation = {x:Int,y:Int->x+y}
    //(Int,Int) - > Int is not compatible with (Double,Double)->Double

    /**
     * Use Unit to say a lambda has no return value...
     *If you want to specify that a lambda has no return value,
     * you can do so by declaring that its return type is Unit.
     * The following lambda, for example, has no return value, and prints
     * the text "Hi!" when it is invoked.
     */

    val myLambda: () -> Unit = { println("Hi!") }
    myLambda.invoke()

    var a: Int? = null
    val b: () -> Unit = { a = 12 }
    b.invoke()
    println(a)

    




}