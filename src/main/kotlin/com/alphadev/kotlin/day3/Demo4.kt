package com.alphadev.kotlin.day3

fun main() {
    var firstName: String? = "Bhaskar"
    var lastName: String? = "Kulkarni"

    //traditional if and else
    if(firstName != null) {
        println(firstName.length)
    } else {
        println(-1)
    }

    if(lastName != null) {
        println(lastName.length)
    } else {
        println(-2)
    }

    println()

    /*var firstNameLength: Int = if (firstName != null) {
        firstName.length
    } else {
        -1
    }

    var lastNameLength: Int = if (lastName != null) {
        lastName.length
    } else {
        -1
    }

    println("$firstNameLength, $lastNameLength")*/

   /* var  firstnameLength: Int = if(firstName != null)
        firstName.length
    else
        -1

    var lastNameLength: Int = if (lastName != null)
        lastName.length
    else
        -1

    println("$firstnameLength, $lastNameLength")*/

    //using if as an expression
    /*var firstNameLength = if(firstName != null) firstName.length else -1
    var lastNameLength = if(lastName != null) lastName.length else -1
    println("$firstNameLength, $lastNameLength")*/

    // using the elvis operator
    var firstNameLength = firstName?.length ?: -1
    var lastNameLenght = lastName?.length ?: -1
    println("$firstNameLength, $lastNameLenght")
}