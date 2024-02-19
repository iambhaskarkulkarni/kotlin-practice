package com.alphadev.kotlin.day4

open class Employeee{
    var firstName = ""
    var lastName = ""

    fun getFullName() {
        println("$firstName $lastName")
    }
}

class FullTimeEmployee: Employeee() {

}

fun main() {
    var fullTimeEmployee = FullTimeEmployee()
    fullTimeEmployee.firstName = "Bhaskar"
    fullTimeEmployee.lastName = "Kulkarni"
    fullTimeEmployee.getFullName()
}
