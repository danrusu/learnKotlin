package basics

fun main() {
    val h1 = Header("H1")
    val h2 = Header("H2")

    val h3 = h1.plus(h2)
    val h4 = h1 plus h2 // needs infix
    val h5 = h1 + h2    // needs operator; only default operators can be overloaded; used for DSLs

    println(h3.name)
    println(h4.name)
    println(h5.name)
}

operator infix fun Header.plus(other: Header): Header {
    return Header(this.name + other.name)
}

class Header(val name: String){}
