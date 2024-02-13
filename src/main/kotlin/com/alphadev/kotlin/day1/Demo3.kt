package com.alphadev.kotlin.day1

fun main() {
    // traditional
    /*var age = 20
    if(age > 18) {
        println("eligible")
    } else {
        println("Not-Eligible")
    }*/

    var age = 15
    var result = if(age > 18) {
        "Eligible"
    } else {
        "Not-Eligible"
    }
    println(result)
    /*
    var num1 = 10
    var num2 = 20
    var result2 = if(num1 > num2) {
        "num1 is greater then num2"
    } else {
        "num2 is greater then num1"
    }*/

    var num1 = 10
    var num2 = 20
    var result3 = if(num1 > num2) "num1 is greater then num2" else "num2 is greater then num1"
    println(result3)
}