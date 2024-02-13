package com.alphadev.kotlin.day2

//without return type and without parameter
fun addNumber1() {
    val num1 = 10
    val num2 = 20
    println(num1+num2)
}

//without return type and with parameter
fun addNumber2(num1:Int, num2:Int) {
    println(num1+num2)
}

//with return type and with parameters
fun addNumber3(num1: Int, num2:Int):Int {
    return (num1+num2)
}

//with return type and without parameter
fun addNumber4():Int {
    val num1 = 10;
    val num2 = 20
    return num1+num2
}

fun main() {
    addNumber1()
    addNumber2(20, 30)
    println(addNumber3(30,80))
    println(addNumber4())
}