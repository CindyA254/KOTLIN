fun main(args: Array<String>) {
    println("Number Range:")


    for (num in 1..5) { //(type the number, two dots then he number)
        println(num)
    }
    println("Character Range:")

    for (char in 'A'..'E')
        println(char)

    var number = 1.rangeTo(5)
    println("range to")
    for (x in number) {
        println(x)
    }

//using down tool
    var namba = 10.downTo(1)
    println("Downto:")
    for (y in namba) {
        println(y)
    }
//declare step values other tha default
    var num1 = 1.rangeTo(10)
    var oddNumber = num1.step(3)
    for (n in oddNumber) {
        println(n)

    }

    //checking values in a range
    val OneToSix = 1..6
    println("3 in one to six: ${3 in OneToSix}")
    println("7 in one to six: ${7 in OneToSix}")

}
