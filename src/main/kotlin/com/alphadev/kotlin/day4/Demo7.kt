package com.alphadev.kotlin.day4


abstract class Shape {
    var width = 0.0
    var height = 0.0
    var radius = 0.0
    val pie = 3.14

    abstract fun getArea()
}

class Rectangle(): Shape() {
    constructor(width: Double, height: Double):this() {
        this.width = width
        this.height = height
    }
    fun draw() {
        println("rectangle drawing .......")
    }

    override fun getArea() {
        println("Area : ${width * height}")
    }
}

class Circle(): Shape() {
    constructor(radius: Double):this() {
        this.radius = radius
    }
    fun draw() {
        println("circle drawing .......")
    }

    override fun getArea() {
        println("Area: ${pie * radius * radius}")
    }
}

fun main() {
    var rectangle = Rectangle(12.3, 56.78)
    var circle = Circle(55.55)

    rectangle.draw()
    rectangle.getArea()

    circle.draw()
    circle.getArea()
}