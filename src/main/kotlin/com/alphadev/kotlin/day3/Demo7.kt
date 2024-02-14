package com.alphadev.kotlin.day3

class Customer(var firstName: String, var lastName:String, var age: Int) {

    fun getFullName() {
        println("Name : $firstName $lastName")
    }

    companion object {
        var companyName = "ABC Company"

        fun getCompanyName() {
            println("The Company Name is : $companyName")
        }
    }
}

fun Customer.getAge() {
    println("$firstName age is $age")
}

fun Customer.Companion.printSomething() {
    println("The company extension function is : $companyName")
}

fun main() {
    val customer = Customer(age = 30, lastName = "Bhaskar", firstName = "Bhaskar")
    customer.getFullName()
    customer.getAge()

    Customer.getCompanyName()
    Customer.printSomething()
}