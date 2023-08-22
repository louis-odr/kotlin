import kotlin.math.sqrt

fun main(args: Array<String>) {
    //Inbuilt functions
    //User defined functions
    var greeting = "Hello there"
    println(greeting.uppercase())
    println(greeting.lowercase())
    println(greeting.reversed())
    println(greeting.replace("there",  "King"))
    //User defined functions

    var number = 10.0
    println(sqrt(number))
    println(Math.pow(number,2.0))
   // user Defined functions
    addition(10,20)
    addition(70,90)
    avg(10.0,40.0f,90)


}


fun motto(){

    println("Hello,this is our motto")
}
fun mission(){
    println("This is our mission")
}

fun add(){
    var x = 10
    var y = 20
    var z = x + y
    println("Your answer is $z")

}
fun addition(x:Int, y:Int){
    var z = x + y
    println("Your answer is $z")
}

fun avg(x: Double,y: Float, z:Int){
    var average = (x + y + z) /3.0
    println("Your answer is $average")


}
fun mean(x: Int, y:Double):Double{
    var result = (x + y)/2.0
    return result
}
//fun fullName(firstName:String, lastName:String):String=
 fun fullname( firstName:String, lastName:String):String{
     var name = "$firstName $lastName"
     return name
 }