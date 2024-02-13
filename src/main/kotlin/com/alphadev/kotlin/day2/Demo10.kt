package com.alphadev.kotlin.day2

class Test2 {
    constructor() {
        println("First Secondary Constructor")
    }

    constructor(id:Int) {
        println("Second Secondary Constructor")
    }
}

fun main() {
    val obj = Test2()
}