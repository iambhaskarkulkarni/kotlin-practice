package com.alphadev.kotlin.day2

class Customer(var name: String) {

    constructor(id: Int, name: String):this(name) {
        println("Customer Id: $id")
        println("Customer Name: $name")
    }

    fun getName() {
        println(name)
    }
}

fun main() {
    val customer1 = Customer("A") // primary constructor
    var customer2 = Customer(1, "A") // secondary constructor


}