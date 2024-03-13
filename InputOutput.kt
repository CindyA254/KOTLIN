import java.util.Scanner

//picks input from the user
fun main(args: Array<String>) {
    print("please type a word here: ")
    var enteredString = readLine()
    println("you have typed : $enteredString")
    print("please write any number: ")
    var anyNumber =Integer.valueOf(readLine())
    println("you have entered number $anyNumber")
//scans
var read = Scanner(System.`in`)
println("please enter an integer number:")
    var integerNumber = read.nextInt()
    println("This is the number entered $integerNumber")

    println("enter a float number: ")
    var floatNumber = read.nextFloat()
    println("this is the float number entered:$floatNumber")
}