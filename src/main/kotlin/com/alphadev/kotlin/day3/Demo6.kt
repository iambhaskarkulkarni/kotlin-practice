package com.alphadev.kotlin.day3

class Student {
    var id:Int = 0
    var firstName: String = ""
    var lastName: String = ""
//    var schoolName: String = "ABC School"

    fun setData(id:Int, firstName: String, lastName: String) {
        this.id = id
        this.firstName = firstName
        this.lastName = lastName
    }

    fun getData() {
        println("Id : $id , Name : $firstName $lastName")
    }

    companion object {
        var schoolName = "ABC school"

        fun getSchoolName() {
            println("School Name: $schoolName")
        }

        fun getMySchool() : String {
            return schoolName;
        }
    }
}

fun main() {
    val student = Student()
    student.setData(1, "Bhaskar", "Kulkarni")
    student.getData()
    Student.getSchoolName()
    println( Student.getMySchool())
}