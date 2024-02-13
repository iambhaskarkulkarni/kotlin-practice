package com.alphadev.kotlin.day2

class Calculator {
    var num1:Int = 0
    var num2:Int = 0

    fun addNumber(num1: Int, num2: Int) {
        println(num1+num2)
    }

    fun subNumber(num1: Int, num2: Int) {
        println(num1-num2)
    }

    fun multiple():Int {
        return num1*num2
    }
}

fun main() {
    val calculator = Calculator()
    calculator.num1 = 100
    calculator.num2 = 200
    calculator.addNumber(20, 50)
    calculator.subNumber(50, 20)
    println(calculator.multiple())
}