package com.alphadev.kotlin.day4

// with return with parameter
fun addNumber1(num1: Int, num2: Int) : Int {
    return num1 + num2
}

//with return without parameter
fun addNumber2(): Int {
    var num1 = 10
    var num2 = 20
    return num1 + num2
}

// without return with parameter
fun addNumber3(num1: Int, num2: Int) {
    println(num1 + num2)
}

// without return with parameter
fun addNumber4() {
    var num1 = 10
    var num2 = 20
    println(num1 + num2)
}