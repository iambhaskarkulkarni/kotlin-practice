package com.alphadev.kotlin.day3

class User(f: String, l:String) {
    var firstName:String = ""
    var lastName:String = ""
    init {
        firstName = f
        lastName = l
    }

    fun getFullName() {
        println("$firstName $lastName")
    }
}

class User1(var firstName: String, var lastName:String) {
    fun getFullName(){
        println("$firstName $lastName")
    }
}

class User3(var firstName: String = "", var lastName: String = "") {
    fun getFullName() {
        println("$firstName $lastName")
    }
}

fun main() {
    val user1 = User3()
    val user2 = User3("Bhaskar")
    val user3 = User3("Bhaskar Kulkarni")
    println(user1.getFullName())
    println(user2.getFullName())
    println(user3.getFullName())
}
