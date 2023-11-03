import kotlin.math.pow

//Calculate the area and perimeter of the triangle with given sides.


fun main(args: Array<String>) {


    val perimeterCalculator: (Double, Double, Double) -> Double = { x: Double, y: Double, z: Double -> x + y + z }
    val areaCalculator: (Double, Double, Double) -> Double = { x, y, z ->
        (perimeterCalculator(x, y, z) / 2 * (perimeterCalculator(
            x,
            y,
            z
        ) / 2 - x) * (perimeterCalculator(x, y, z) / 2 - y) * (perimeterCalculator(x, y, z) / 2 - z)).pow(0.5)
    }
    val printer: (Double, Double, Double) -> Unit
    printer = { x, y, z ->
        print(
            "\n The area of given triangle is ${
                areaCalculator(
                    x,
                    y,
                    z
                )
            } and perimeter is ${perimeterCalculator(x, y, z)}"
        )
    }
    print("Please enter the first side :")
    val x: Double = readln().toDouble()
    print("Please enter the first side :")
    val y: Double = readln().toDouble()

    print("Please enter the first side :")
    val z: Double = readln().toDouble()


    val triangleValidator: (Double, Double, Double) -> Boolean = { x, y, z ->
        if (
            Math.abs(x + y) > z &&
            Math.abs(x - y) < z &&
            Math.abs(x + z) > y &&
            Math.abs(x - z) < y &&
            Math.abs(z + y) > x &&
            Math.abs(z - y) < x
        ) true
        else false


    }

    if(triangleValidator.invoke(x,y,z)){
        printer.invoke(x, y, z)
    }else{
        println("There is no such a triangle")
    }







}