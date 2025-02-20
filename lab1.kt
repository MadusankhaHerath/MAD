fun printage(age:Int,name:String) {
    println("$name is $age years old")
}
    val na = "Dilshan"
    var uni = "SLLIT"
var fruit = arrayOf("man","apple","ban","pap")
var x = 2


fun main(){

    println("Hello Dilshan")
    println(" ")
    printage(12,"Dilshan")
    println(" ")
    println("$na is study at $uni ")
    println(fruit[2])
    println(" ")
    fruit[3] = "sta"

    for(i in fruit){
        println(i)
    }
    println(" ")

    when(x){
        2,3 -> println ("it is correct")
        else ->println ("it is incorrect")
    }
    println(" ")
    for(i in 0..10){
        println(i)
    }
    println(" ")
    for(i in 1 until 10){
        println(i)
    }
    println(" ")
    for (i in 0..30 step 5){
        println(i)
    }


}