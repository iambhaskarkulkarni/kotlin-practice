package com.alphadev.kotlin.day3

fun main() {

    var name: String? = ""
//    println(name.length) compile time error

    //smart cast
    if(name != null) {
        println(name)  // it will work
    }

    var obj: Any = "Hello World"
    if(obj is String) {
        println(obj.length)
    }

    if(obj !is String) {
        // handle null value here
    } else {
        println(obj.length)
    }
}