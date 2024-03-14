fun main(args: Array<String>) {
    println(birthdayGreeting("", 12,"Felix"))
    println(birthdayGreeting("Alex", 34, "Felisha"))
    println(birthdayGreeting("Felix", 25, "Angela"))
    println(birthdayGreeting("Cindy", 32, "Viola"))

}
fun birthdayGreeting(name: String="john", age: Int,name1: String):String{
    val a = "happy birthday $name"
    val b = "you are $age yrs old"
    val c = "you are celebrated"
    val d = "regards from $name"
    return "$a\n$b\n$c\n$d"
}



