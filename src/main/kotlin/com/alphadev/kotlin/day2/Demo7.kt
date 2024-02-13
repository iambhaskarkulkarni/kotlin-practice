package com.alphadev.kotlin.day2

// primary constructor with parameter and init block
class Employee2 constructor(f: String, l: String) {
    var firstName = ""
    var lastName = ""

    init {
        firstName = f
        lastName = l
    }

    fun getFullName() {
        println("$firstName $lastName")
    }
}

fun main() {
    val emp = Employee2("Bhaskar", "Kulkarni")
    emp.getFullName()
}