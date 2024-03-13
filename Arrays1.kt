fun main(args: Array<String>) {
    //containers that hold data sets
    var arr = arrayOf(10,"faith",23.4,'A')//all data types
    var arr1 = arrayOf<Int>(12,232,343,545)
    var arr2 = arrayOf<String>("john, kube,Ester") //hosts string only

//print out index
println(arr[1])
println(arr[2])
 println(arr[3])

    //modify array using set function and index function
//set function
 var fruits= arrayOf("banana","Oranges", "Apples")
 fruits.set(1, "pineapple")
 //index function
    fruits[0]="Tomato"
    //we ue a for loop to print-out an array
 for(fruit in fruits){
    println(fruit)
//using the function to fetch value from array
     var car = arrayOf("Benz", "lambourgini","Toyota,Honda")
     println(car.get(0))



}





}


