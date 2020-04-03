package types

// Objects let us create Singletons
// Companion Objects - are used for Factory objects and static members

class Course(val id: Int, val name: String)
open class Trainee(val name: String) {
    // static factories
    companion object : XMLSerializer<Trainee> {
        fun createJavaTrainee(name: String): JavaTrainee {
            return JavaTrainee(name)
        }

        fun createKotlinTrainee(name: String): KotlinTrainee {
            return KotlinTrainee(name)
        }

        override fun toXml(item: Trainee) {
            TODO("Not yet implemented")
        }
    }
}

class JavaTrainee(name: String) : Trainee(name)
class KotlinTrainee(name: String) : Trainee(name)

// Singleton
// - can derive from other classes
// - can implement interfaces
object Courses {
    var allCourses = arrayListOf<Course>()
}

fun Trainee.enrole(courseName: String) {
    val course: Course? = Courses.allCourses
        .filter { it.name == courseName }
        .firstOrNull()

    println("Trainee ${this.name} enrolled to course: ${course?.name}")
}

interface XMLSerializer<T> {
    fun toXml(item: T)
}

// to be able to run types.Program
class Program{
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            println("Companion object main needs static annotation to be able to run.")
        }
    }
}

fun main() {
    Courses.allCourses.add(Course(1, "Java Fundmentals"))
    Courses.allCourses.add(Course(2, "Java Advanced"))
    Courses.allCourses.add(Course(3, "Kotlin"))

    Trainee("Dan Rusu").enrole("Kotlin")
    Trainee("Dan Rusu").enrole("Scala")

    // static calls to create objects, using companion object
    Trainee.createJavaTrainee("John Doe")
    Trainee.createKotlinTrainee("Jane Doe")
}