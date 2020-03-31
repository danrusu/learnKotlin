package base

fun main(args: Array<String>) {

    println("\nList")
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9);
    for(n in numbers){
        print("$n ")
    }

    println("\n\nSet")
    val uniqueNumbers = setOf(1,2,3,1,2,3,1,1,1,1,4,5,3,4)
    println(uniqueNumbers)

    println("\nMap")
    val usersById = mapOf(
        1111 to "danginkgo",
        1112 to "guest"
    )
    for ((id, user) in usersById) println("${id}: $user")

    // ranges
    println("\nClosed range")
    for (i in 1..10) print("$i - ")
    println("\n\nOpened range")
    for (i in 1 until 10) print("$i - ")
}