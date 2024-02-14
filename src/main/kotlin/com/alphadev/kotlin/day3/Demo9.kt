package com.alphadev.kotlin.day3

data class StudentData(
    var id: Int? = null,
    var firstName: String? = null,
    var lastName: String? = null,
    var email: String? = null
)

fun main() {
    var stu = StudentData()
    var student = StudentData(1, "Bhaskar", "Kulkarni", "b.kulkarni1992@gmail.com")
    println(student.firstName)
    student.lastName = ""
    println(student )
}