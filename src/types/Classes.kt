package types

// classes are public and final by default
// functions are final by default

open class Person{
    var firrstName: String = ""
    var lastName: String = ""

    open fun getName(): String = "$firrstName $lastName"
}

class Student: Person(){
    override fun getName(): String {
        return ""
    }
}