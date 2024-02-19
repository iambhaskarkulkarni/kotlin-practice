package com.alphadev.kotlin.day4

abstract class Test {
    abstract fun display()
}

class Output: Test() {
    override fun display() {
        println("concerete implimentation.....")
    }

}

fun main() {
    var output = Output()
    output.display()
}