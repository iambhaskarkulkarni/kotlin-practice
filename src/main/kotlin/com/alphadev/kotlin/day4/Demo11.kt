package com.alphadev.kotlin.day4

var count = 0

fun recursiveDemo() {
    count ++
    if(count <= 5) {
        println(count)
        recursiveDemo()
    }
}

fun main() {
    recursiveDemo()
}