package functions

fun main() {
    val text = "Text    with  multiple  \tspaces"
    println(text)
    println(reduceMultipleSpacesToOne(text))    // classic utility approach
    println(text.reduceMultipleSpacesToOneEx()) // function extension (static)
}

fun reduceMultipleSpacesToOne(text: String): String{
    val regex = Regex("\\s+")
    return regex.replace(text, " ")
}

fun String.reduceMultipleSpacesToOneEx(): String{
    val regex = Regex("\\s+")
    return regex.replace(this, " ")
}
