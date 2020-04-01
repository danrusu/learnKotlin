package functions

import java.math.BigInteger

fun main(args: Array<String>) {
    //println(fibonacci(10000, BigInteger("1"), BigInteger("0")))  // java.lang.StackOverflowError
    println(fib(10000, BigInteger("1"), BigInteger("0")))  // tailrec
}

// 1, 1, 2, 3, 5, 8, 13, ...
fun fibonacci(n: Int, a: BigInteger, b:BigInteger): BigInteger{
    return if (n == 0) b else fibonacci(n-1, a+b, a)
}

tailrec fun fib(n: Int, a: BigInteger, b:BigInteger): BigInteger{
    return if (n == 0) b else fib(n-1, a+b, a)
}
