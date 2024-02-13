package com.alphadev.kotlin.day2

// primary constructor with property
class Employee3(var firstName:String, var lastName:String) {

    fun getFullName() {
        println("$firstName $lastName")
    }
}

fun main() {
    val emp = Employee3("Bhaskar", "Kulkarni")
    emp.getFullName()
}