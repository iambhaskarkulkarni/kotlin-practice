package com.alphadev.kotlin.day1

fun main() {
    var names = arrayOf("Bhaskar", "Prabhakar", "Harihar")
    for (name in names) {
        println(name)
    }

    println()


    var numbers = arrayOf(10,20,30)
    for(number in numbers) {
        println(number)
    }

    println()

    println("range 1 to 5")
    for(i in 1..5){
        println(i)
    }

    println("range 5 to 1")
    for(i in 5 downTo 1) {
        println(i)
    }

    println("range 1 to 10 step 2")
    for(i in 1..10 step 2) {
        println(i)
    }

    println("range 10-1 down 2")
    for (i in 10 downTo 1 step 2){
        println(i)
    }




}