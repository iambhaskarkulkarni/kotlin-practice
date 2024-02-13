package com.alphadev.kotlin.day1

fun main() {
    var number = 4
    var result = when(number) {
        1 -> "One"
        2 -> "two"
        3 -> "three"
        else -> "invalid number"
    }
    println(result)

    /*var number1 =1
    when(number1) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
    }*/

    var number1 =1
    when(number1) {
        1 -> {
            println()
            println("One")
        }
        2 -> println("Two")
        3 -> println("Three")
    }

    // using when in the branches
    var number3 = 1
    when(number3) {
        1,3,5 -> println("First Phase")
        2,4,6 -> println("Second Phase")
        8,10,12 -> println("Third Phase")
    }

    //using when in the range
    var number4 = 9
    when(number4) {
        in 1..5 -> println("range between 1 - 5")
        in 6..10 -> println("range between 6 - 10")
    }


}