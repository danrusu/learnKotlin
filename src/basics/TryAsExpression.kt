package basics

import java.lang.NumberFormatException

fun toInt(numberAsString: String): Int{
    val number: Int = try{
        Integer.parseInt(numberAsString)
    }
    catch(ex: NumberFormatException){
        -1
    }

    return number
}

fun main() {

    val numberString1 = "4";
    val numberString2 = "four";

    println("number1: ${toInt(numberString1)}")
    println("number2: ${toInt(numberString2)}")
}