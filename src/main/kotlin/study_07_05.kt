data class Person(var name: String, var age: Int)

val emotions = setOf(
    "happy",
    "Curious",
    "Joyful",
    "happy",
    "Joyful"
)

fun studymutableListOf(){
    val numbers = mutableListOf("one", "two", "three", "four")
    numbers.add("five")   // this is OK
    println(numbers)

    println(emotions)

    val stringList = listOf("one", "two", "one")
    printAll(stringList)

    val stringSet = setOf("one", "two", "three","one")
    printAll(stringSet)
    //numbers = mutableListOf("six", "seven")      // compilation errord
    val words = "A long time ago in a galaxy far far away".split(" ")
    val shortWords = mutableListOf<String>()
    words.getShortWordsTo(shortWords, 3)
    println("shortWords : " + shortWords)
}

fun printAll(stringList: Collection<String>) {
   for(s in stringList) print("$s ")
    println()
}

fun List<String>.getShortWordsTo(shortWords: MutableList<String>, maxLength: Int) {
    this.filterTo(shortWords) { it.length <= maxLength }
    // throwing away the articles
    val articles = setOf("a", "A", "an", "An", "the", "The")
    shortWords -= articles
}

fun studyList(){
    val numbers = listOf("one", "two", "three", "four")
    println("Number of elements: ${numbers.size}")
    println("Third element: ${numbers.get(2)}")
    println("Fourth element: ${numbers[3]}")
    println("Index of element \"two\" ${numbers.indexOf("two")}")

    val bob = Person("Bob", 31)
    val people = listOf(Person("Adam", 20), bob, bob)
    val people2 = listOf(Person("Adam", 20), Person("Bob", 31), bob)
    println(people == people2)
    bob.age = 32
    println(people == people2)
}

fun studyArry(){
    val numbers = mutableListOf(1, 2, 3, 4)
    numbers.add(5)
    numbers.removeAt(1)
    numbers[0] = 0
    numbers.shuffle()
    println(numbers)

}

fun studySet(){
    val numbers = setOf(1, 2, 3, 4)
    println("Number of elements: ${numbers.size}")
    if (numbers.contains(1)) println("1 is in the set")

    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbers == numbersBackwards}")

    val numbers2 = setOf(1, 2, 3, 4)  // LinkedHashSet is the default implementation
    val numbersBackwards2 = setOf(4, 3, 2, 1)

    println(numbers2.first() == numbersBackwards2.first())
    println(numbers2.first() == numbersBackwards2.last())
}


fun main(){
    studymutableListOf()
    studyList()
    studyArry()
    studySet()
}