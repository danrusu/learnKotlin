package types

interface Time{
    fun setTime(h: Int, m: Int = 0, s: Int = 0)
    fun double(n: Int) = 2 * n; // default method; it does not break implementations
    fun message() = println("message from Time")
}

interface EnhancedTime{
    fun message() = println("message from EnhancedTime")
}

class YetiTime: Time, EnhancedTime{  // : is the extends operator
    override fun setTime(h: Int, m: Int, s: Int) {
        TODO("Not yet implemented")
    }

    // need to override default method inherited from both parents
    override fun message() {
        super<Time>.message()
        super<EnhancedTime>.message()
    }
}

fun main() {
    YetiTime().message()
}