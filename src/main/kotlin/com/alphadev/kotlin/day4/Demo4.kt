package com.alphadev.kotlin.day4

class OuterClass2 {

    var name = "Jhon"

    inner class InnerClass {
        var email = "b.kulkarni1992@gmail.com"

        fun getInfo() {
            println("Name : $name")
            println("Email : $email")
        }
    }
}

fun main() {
    var outObj = OuterClass2()
    println(outObj.InnerClass().getInfo())
}