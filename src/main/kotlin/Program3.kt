/**
 * Write a function that receives AND returns lambdas
 */
fun resultantLambda(
    f: (Int) -> Int,
    g: (Int) -> Int,
    h: (Int) -> Int

): (Int) -> Int {

    return { x: Int -> f(g(h(x))) }

}

//Ise typealias to provide a different name for an existing type
/**
 * A type alias lets you provide an alternative name for an existing type,
 * which you can then use in your code.
 * This means that if your code uses a function type such as (Double)->Double
 * ,you can define a type alias that's used in its place,
 * making your code more readable.
 *
 * You define a type alias using the typealias keyword.
 * Here's how;
 * for example you use it to define a type alias named DoubleConversion that
 * we can use in place of the function type (Double)->Double
 */

typealias DoubleConversion = (Double)->Double
//this type alias means that we can use DoubleConversion in place of
//(Double)->Double

//This means that convert and resultantLambda function can now become;

fun convert2(x:Double, converter:DoubleConversion):Double{
    val result = converter(x)
    println("$x is converted to $result")
    return result
}

//and...

fun myResultantFunction(
    f:DoubleConversion,
    g:DoubleConversion,
    h:DoubleConversion):DoubleConversion{
    return {x:Double->f(g(h(x)))}
}
//More readable

//You can use typealias to provide an alternative name for any type, not just function types. You can,
// have a look at main fun.



fun main(args:Array<String>){
   val result= resultantLambda(
        {x:Int->x*2},//f(x)=2x
        {x:Int->x*3},//g(x)=3x
        {x:Int->x*4} //h(x)=4x
    )(5)//->f(g(h(5)))

    println(result)
     val x:myDataType=7
    val z: ArrayList<Int> = arrayListOf(1,2,3,4)

}

typealias myDataType =Int
typealias myArrayDataType=Array<Int>


