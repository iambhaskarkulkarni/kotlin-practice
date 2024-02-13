package com.alphadev.kotlin.day2

class Student {
    constructor() {
        println("first constructor")
    }

    constructor(i: Int) {
        println("second constructor")
    }

    constructor(s: String) {
        println("third constructor")
    }

    constructor(i: Int, s: String) {
        println("four constructor")
    }

    constructor(s:String, i: Int) {
        println("five constructor")
    }
}

fun main() {
    val obj = Student()
    val obj2 = Student(1)
    val obj3 = Student("Bhaskar")
    val obj4 = Student(1, "Bhaskar")
    val obj5 = Student("bhaskar", 2)
}