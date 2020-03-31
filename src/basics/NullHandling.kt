package basics

fun main() {

    // var text0: String = null; // not allowed
    var text1: String? = null;

    var text2: String = "message";

    // print uppercase of text only if it is not null (null check)
    println("Text1: " +  text1?.toUpperCase())
    println("Text2: " +  text2.toUpperCase())




}