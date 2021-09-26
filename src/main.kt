
fun addSomeNumbers(x: Int, y: Int): Int{
    return x+y
}

fun getSquareArea(): Int {
    print("please enter measurements for a side of the square in ft \n")
    var x = readLine()!!.toInt()
    var area = x*x
    return area

}

fun getCircleArea(): Double {
    print("please enter measurements for a diameter of the circle in ft \n")
    var d = readLine()!!.toDouble()
    var area = (3.14/4)*(d*d)
    return area
}

fun getTriangleArea(): Double {
    print("please enter measurements for the base of the triangle in ft \n")
    var b = readLine()!!.toInt()
    print("please enter measurements for the height of the triangle in ft \n")
    var h = readLine()!!.toInt()
    var area = ((1.5)*(b*h))
    return area
}

fun getRectangleArea(): Int{
    print("please enter measurements for the base of the rectangle in ft \n")
    var b = readLine()!!.toInt()
    print("please enter measurements for the height of the rectangle in ft \n")
    var h = readLine()!!.toInt()
    var area = h * b
    return area
}

// returns a bool for menu exit for user
fun askToExit(): Boolean{
    print("would you like to check another area?\n")
    var answer: String? = readLine()
    return if (answer?.lowercase() == "n") {
        true
    } else if (answer?.lowercase() == "y") {
        println("next area...")
        false
    } else {
        println("That is not a valid answer")
        println("next number...")
        false
    }
}


fun main() {
    println(addSomeNumbers(2, 4))
    var selectionNum = 0
    var finished = false
    while (finished != true) {
        print(
            "Please select the shape to evaluate\n" +
                    "1. Square\n" +
                    "2. Circle\n" +
                    "3. Triangle\n" +
                    "4. Rectangle\n" +
                    "5. exit\n"
        )
        selectionNum = readLine()!!.toInt()
        when (selectionNum) {
            1 -> println("square area is: ${getSquareArea()}ft.")
            2 -> println("circle area is: ${getCircleArea()}ft.")
            3 -> println("triangle area is: ${getTriangleArea()}ft.")
            4 -> println("rectangle area is: ${getRectangleArea()}ft.")
            5 -> break
            !in 1..5 -> println("that is an invalid selection")
            else -> println("That is not a valid selection")
        }
        finished = askToExit()

    }
}



