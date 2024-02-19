package com.alphadev.kotlin.day4

fun addNumber(a: Int, b: Int) {
    println(a+b)
}

fun main() {
    addNumber(10, 20)

//    var sum = (a, b) -> { a + b}

    var result = {"Hello World"}

    var result2: (String) -> Unit = {
        name:String -> println("Wellcome $name")
    }

    var sum: (Int, Int) -> String = {
        a,b -> "Sum : ${a+b}"
    }

    var sum2: (Int, Int) -> Int = {
        a,b -> a+b
    }

    println(result)
    println("Bhaskar")
    println(sum(100, 200))
    println(sum2(200, 400))
}