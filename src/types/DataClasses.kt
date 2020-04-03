package types

/*
- provide a convenient way to override equals, hashCode and toString
- usually used for DTO
- typically immutable
- `copy` method is provided
*/

data class Meeting(val name: String, val location: String)
class Employee(val id: Int, val name: String)

fun main() {
    println("[Data Class]")
    val interviewTim1 = Meeting("Interview", "Timsioara")
    val interviewTim2 = Meeting("Interview", "Timsioara")
    val interviewBuc = interviewTim1.copy(location = "Bucharest")

    println(interviewBuc) // toString override
    println("interviewTim1 == interviewTim2: ${interviewTim1 == interviewTim2}")

    println("[Normal Class]")
    val azetsEmployee = Employee(1111, "Dan Rusu")
    val nagarroEmployee = Employee(1111, "Dan Rusu")
    println("azetsEmployee == nagarroEmployee: ${azetsEmployee == nagarroEmployee}")
    println(nagarroEmployee)
}
