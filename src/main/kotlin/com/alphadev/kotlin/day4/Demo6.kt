package com.alphadev.kotlin.day4

abstract class Calculator {
    //non-abastract method
    fun addNumber(num1:Int, num2:Int) {
        println("Sum: ${num1 + num2}")
    }

    fun subNumber(num1: Int, num2: Int) {
        println("Sub : ${num1 - num2}")
    }

    abstract fun mulNumber(num1: Int, num2: Int)
    abstract fun division(num1: Int, num2: Int)
}

class Output2: Calculator() {
    override fun mulNumber(num1: Int, num2: Int) {
        println("Mul: ${ num1 * num2}")
    }

    override fun division(num1: Int, num2: Int) {
        println("Div : ${ num1 / num2}")
    }

}

fun main() {
    val calci = Output2()
    calci.addNumber(10, 20)
    calci.subNumber(20, 10)
    calci.mulNumber(10, 20)
    calci.division(20,2)
}