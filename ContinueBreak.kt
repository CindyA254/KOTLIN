fun main(args: Array<String>) {
    for (n in 1..10){
        println("before continue, loop: $n")

        if (n==2||n==5)
            println("after continue loop : $n")
    }
//terminating a loop using the break
 for(m in 1..5){
     println("before break, loop: $m")
     if(m==5) {
         println("I am terminating the loop...")
         break
     }
  //terminate the loop round an alphabet at //point character 'p'
  for(b in 'a'..'z'){
      println("before break loop $b")
      if (b=='p'){
          println("i am terminating the loop..")
          break

      }          
  }




 }



}