class Bird {
    var type: String = ""
    var color: String = ""
}

class birdConstructor(var type:String,var color :String){

}

interface vehicle{
    fun start()
    fun stop()
}
class car: vehicle{
    override fun start() {
        println("car started")
    }
    override fun stop(){
        println("car stoped")
    }

}

fun main() {
    // Create an object of the Bird class
    val b1 = Bird()

    // Access the properties and assign values
    b1.type = "Parrot"
    b1.color = "Green"

    // Print the values
    println(b1.type)
    println(b1.color)
    println("${b1.type} is ${b1.color} in color")
    println("")

    //print the constructor
    val b2 =birdConstructor("crow","black")

    println(b2.type)
    println(b2.color)
    println("${b2.type} is ${b2.color} in color")
    println("")

    val obj= car()
    obj.start()
    obj.stop()
}
