package com.alphadev.kotlin.day2

class Employee {
    var firstname = ""
    var lastName = ""

    fun getFullName() {
        println("$firstname $lastName")
    }
}

fun main() {
    val employee = Employee()
    employee.firstname = "Bhaskar"
    employee.lastName = "Kulkarni"
    employee.getFullName()
}