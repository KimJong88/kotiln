val PI = 3.14
var x = 0

fun incrementX() {
    x += 1
}

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2
}

fun main() {
    var hello: String = "Hello World!"
    println("hello : " + hello)

    var greeting = "Hello World!"
    greeting = "Hello Kotlin!"
    println("greeting : " + greeting)

    val language = "Kotlin"
    val creator = "JetBrains"
    val description = language + " is created by " + creator
    // description = "Kotlin is created by JetBrains"
    println("language : " + language)
    println("creator : " + creator)
    println("description : " + description)

    val releaseDate = "July 2011"
    val releaseString = "Kotlin was released in $releaseDate"
    println("releaseDate : " + releaseDate)
    println("releaseString : " + releaseString)

    val num1 = 42 // Int
    println("num1 : " + num1)
    val num2 = 3.14 // Double
    println("num2 : " + num2)
    val num3 = 42L // Long
    println("num3 : " + num3)
    val num4 = 3.14f // Float
    println("num4 : " + num4)
    val num5 = 42.toFloat() // Float
    println("num5 : " + num5)
    val num6 = num1.toDouble() // Double
    println("num6 : " + num6)
    val distToMoon = 92_960_000 // miles (inferred type Int)
    println("distToMoon : " + distToMoon)

    //val x: Int = null // Error - null cannot be a value for non-null type Int
    val x: Int? = null // OK
    //val y: String = null // Error - null cannot be a value for non-null type String
    val y: String? = null // OK

    println("y : " + y?.length)

    var name: String? = null
    name = "Treehouse"
    println("name : " + name!!.length) // prints "9"

    var cardNames = arrayOf("Jack", "Queen", "King")
    println("cardNames : " + cardNames)

    val cards = mutableListOf("Jack", "Queen", "King")

    cards.add("Ace") // Jack, Queen, King, Ace
    cards.remove("Jack") // Queen, King, Ace
    cards.clear() // empty list
    cards.addAll(listOf("Jack", "Queen", "King", "Ace")) // Jack, Queen, King, Ace
    println("cards : " + cards)

    //Maps
    val mapcards = mapOf("Jack" to 11, "Queen" to 12, "King" to 13)
    println("mapcards : " + mapcards)

    val jackValue = mapcards["Jack"] // 11
    println("jackValue : " + jackValue)

    val loopcards = mutableListOf("Jack", "Queen", "King")
    for (loopcard in loopcards) {
        println("loopcards : " + loopcards)
    }
//--------------------------
    val mapcards2 = mapOf("Jack" to 11, "Queen" to 12, "King" to 13)
    for ((name, value) in mapcards2) {
        println("mapcards2 : " + "$name, $value")
    }
//--------------------------
    for (i in 1..10) {
        println("i : " + i)
    }
//--------------------------
    for (i in 10 downTo 1) {
        println(i)
    }
    var a = 5
    var b = 4
    val aIsBigger = if (a > b) true else false
    println("aIsBigger : " + aIsBigger)
//--------------------------
    printSum(-1, 8)
//--------------------------
    println("x = $x; PI = $PI")
    incrementX()
    println("incrementX()")
    println("x = $x; PI = $PI")

    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")
//---------------------------
    var aa = 1
    // simple name in template:
    val s1 = "a is $aa"

    aa = 2
    // arbitrary expression in template:
    val s2 = "${s1.replace("is", "was")}, but now is $aa"

    println(s2)


}