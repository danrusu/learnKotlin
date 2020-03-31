package basics

import java.util.*

fun main() {

    println("\nList")
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9);
    for (n in numbers) {
        print("$n ")
    }

    println("\n\nSet")
    val uniqueNumbers = setOf(1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 4, 5, 3, 4)
    println(uniqueNumbers)

    println("\nMap")
    var usersById = mapOf(
        1111 to "danginkgo",
        1112 to "guest"
    )
    //usersById[1113] = "admin"  //not allowed
    for ((id, user) in usersById) println("${id}: $user")

    // mutable map
    println("\nTreeMap")
    val numbersMap = TreeMap<Int, String>()
    numbersMap[2] = "two"
    numbersMap[1] = "one"
    numbersMap[3] = "three"
    for ((nr, nrName) in numbersMap) println("$nr: $nrName")

    // ranges
    println("\nClosed range")
    for (i in 1..10) print("$i - ")

    println("\n\nOpened range")
    for (i in 1 until 10) print("$i - ")

    println("\n\nDown to with step")
    for (i in 10 downTo 1 step 2) print("$i - ")
}