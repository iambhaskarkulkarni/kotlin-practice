package com.alphadev.kotlin.day4

fun myFun(firstName: String, lastName: String, fn:(String, String) -> String) {
    var fullName = fn(firstName, lastName)
    println("FullName: $fullName")
}

fun main() {
    val fn: (String, String) -> String = {a, b -> "$a $b"}
    myFun("Bhaskar", "Kulkarni", fn)
}