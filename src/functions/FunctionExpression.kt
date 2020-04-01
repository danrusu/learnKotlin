@file:JvmName("MathUtil")

package functions

fun main() {
    println(max(1, 2))
    println(min(1, 2))

}

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun min(a: Int, b: Int): Int {
    return if (a < b) a else b
}