package com.alphadev.kotlin.day4

fun myHo(name: String, email: String, fn:(String, String) -> String) {
    var result = fn(name, email)
    println(result)
}

fun main() {
    var func: (String, String) -> String = {a,b -> "My name is $a and email is $b"}
    myHo("Bhaskar", "b@gmail.com", func)
}