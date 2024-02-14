package com.alphadev.kotlin.day3

class Employee {
    var firstName: String = ""
    var lastName: String = ""
    // 1st option
    // var email = ""

    //2nd option
    // var email: String?= null

    //3rd option
    //lateinit var email: String

    var age: Int = 0

    fun getFullName() {
        println("$firstName $lastName")
    }
}

fun Employee.getAge() {
    println("$firstName is $age years old")
}

fun main() {
    val employee = Employee()
    employee.firstName = "Bhaskar"
    employee.lastName = "Kulkarni"
    employee.age = 30

    employee.getFullName()
    employee.getAge()

}