package basics

fun main() {
    val heKnowsJava = false;

    // if expression
    val message = if (heKnowsJava)
        "He knows Java"
    else
        "He does not know Java"

    println(message)

    // WHEN (similar to Java14 switch)

    //val score = 100
    val score = 200
    //val score = 0

    val scoreMessage = when (score) {
        100 -> "Low score"
        200 -> "Great score"
        else -> "Wrong score"
    }
    println(scoreMessage)


}