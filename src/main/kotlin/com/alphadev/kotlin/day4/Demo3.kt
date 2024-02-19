package com.alphadev.kotlin.day4

class OuterClass {
    var name = "Bhaskar"

    class NestedClass {
        var email = "b.kulkarni1992@gmail.com"

        fun getInfo() {
//            println("Name : $name")  cannot access the out class member
            println("Email : $email")
        }
    }
}

fun main() {
    // initialize the outer class
    var outerObj = OuterClass()
    println("${outerObj.name}")

    // initialize the nested class
    var nestedClass = OuterClass.NestedClass()
    println("${nestedClass.email}")
    nestedClass.getInfo()
}