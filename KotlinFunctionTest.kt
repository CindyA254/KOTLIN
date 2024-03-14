

fun main(args: Array<String>) {
    println(calculateArea(length = 12.6, width = 10.5))
    println(calculateArea())
    calculateCircleArea(10.2)
}
fun calculateArea(length: Double= 10.4, width: Double= 12.5):Double{
    return length * width
}
fun calculateCircleArea(radius: Double, pi: Double=3.14): Double{
    return pi*radius*radius
}