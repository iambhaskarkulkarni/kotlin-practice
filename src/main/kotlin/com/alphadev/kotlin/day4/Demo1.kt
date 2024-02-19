package com.alphadev.kotlin.day4

class Customer(var firstName: String, var lastName: String) {
   /* var firstName = ""
    var lastName = ""

    init {
        this.firstName = firstName
        this.lastName = lastName
    }*/

    fun getFullName() {
        println("$firstName $lastName")
    }
}

fun main() {
    var customer = Customer("Bhaskar", "Kulkarni")
    customer.getFullName()
}