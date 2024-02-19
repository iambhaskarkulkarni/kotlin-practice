package com.alphadev.kotlin.day4

fun display(name: String = "default name", email: String = "default email") {
    println("Name : $name, Email : $email")
}

fun main() {
//    display("bhaskar", "bkulkarni@gmail.com")
//    display("bhaskar")
//    display()

    display(email = "bkulkarni@gmail.com")
    display(email = "bkulkarni@gmail.com", name = "Bhaskar Kulkarni")

}