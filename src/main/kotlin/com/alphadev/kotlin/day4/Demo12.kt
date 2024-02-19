package com.alphadev.kotlin.day4


//recursive example
fun factorial(num: Int) : Int {
    return if(num == 1)
        num
    else
        num * factorial(num -1)
}
//
fun main() {
    var number = 5
    var result = factorial(number)
    println(result)
}