package com.alphadev.kotlin.day4

//class Employee(empId: Int) {
//
//    var empId: Int
//
//    init {
//        this.empId = empId
//        println(empId)
//    }
//}

class Employee<T>(id: T) {
    var id: T
    init {
        this.id = id
        println(id)
    }
}

fun main() {
    var obj = Employee(100)
//    var obj2 = Employee("Test") compile time error

    var obj3: Employee<Int> = Employee(100)
    var obj4: Employee<String> = Employee("Bhaskar")
}