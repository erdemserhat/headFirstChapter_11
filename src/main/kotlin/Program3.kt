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

fun main(args:Array<String>){
   val result= resultantLambda(
        {x:Int->x*2},//f(x)=2x
        {x:Int->x*3},//g(x)=3x
        {x:Int->x*4} //h(x)=4x
    )(5)//->f(g(h(5)))

    println(result)
}