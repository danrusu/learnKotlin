package basics

fun main() {
    val kid = Person("Adela", 3); // no new keyword
    println(kid)
    kid.age++
    // kid.name = ""   // not allowed since name is immutable (val)
    println(kid)
}

class Person(val name: String, var age: Int){

    // fields and methods are by default public
    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }
}