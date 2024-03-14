fun main(args: Array<String>) {
 println(calculateBMI())
}
fun calculateBMI(height:Int=2, weight:Int=60):Int{
    return weight / (height * height)

}