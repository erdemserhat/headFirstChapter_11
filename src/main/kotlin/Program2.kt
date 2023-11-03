/**
 * A function that uses a lambda as a parameter or return value is known
 * as a higher-order functions.
 */


/**
 * You can move the lambda OUTSIDE the ()'s...
 * 
 * So far, you have seen how to call a function with a lambda parameter
 * by passing arguments to the function inside the function's parentheses.
 * We called the convert function, for example, using the following code:
 *
 * Convert(20.0, {c:Double->c*1.8+32})
 *
 * If the final parameter of a function you want to call is a lambda,
 * as is the case with our convert function, you can move the lambda argument outside
 * the function call's parentheses.
 * The following code, for example, does the same thing as the code above,
 * but we have moved the lambda outside the parentheses ;
 *
 * Convert(20.0) {c:Double->c*1.8+32}
 *
 * OR REMOVE THE ()'S ENTIRELY
 * If you have a function that has just one parameter, and that parameter is
 * a lambda, you can omit the parentheses entirely when you call the function
 *
 *
 */

fun convert(x:Double, converter:(Double)->Double):Double{
    val result = converter.invoke(x)
    println("$x is converted to $result")
    return result
}

fun convertFive(converter:(Int)->Double): Double {
    val result = converter(5)
    println("5 is converted to $result")
    return result
}

fun myFun(exLambda:()->Unit){
    //..
    //....
    //......
    //exLambda(1)
    //So that I discover super-function !!
    //You can send some sequence of operations as parameters to the function
    exLambda()


}

fun operate(operation:String):(Int,Int)->Int{
    if(operation=="add"){
        return {x,y->x+y}
    }else if (operation=="minus"){
        return {x,y->x-y}
    }else{
        return {x,y->x}
    }


}
fun main(){
    convert(20.0) { c: Double -> c * 1.8 + 32 }
    // or ;
    convert(24.0){x:Double->x*2+50}

    convertFive {
        it*1.8 + 32
    }

    //Think about android studio setOnClicker Method
    myFun {
        println("Some Operation")
    }

    /**
     * When you have a lambda whose body has multiple lines, the last evaluated
     * expression is used as the lambda's return value
     */

   val x= { x: Int -> println("Test")
       x+2
       //Returns ;
       x + 5 }

    var result = operate("add").invoke(3,5)
    //operate("add")--REFERS FUNCTION'S ITSELF
    result=operate("minus")(10,12)

    println(result)






}

