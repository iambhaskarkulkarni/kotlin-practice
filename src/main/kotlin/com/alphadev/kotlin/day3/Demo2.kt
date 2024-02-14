package com.alphadev.kotlin.day3

fun main() {
    /*var obj: Any ? = null
    var str: String = obj as String
    println(str)*/ // Exception

//    var obj2: Any = 123
//    var str2 : String = obj2 as String
//    println(str2)  exception

    var obj3 : String? = "Hello World"
    var str3: String? = obj3 as String
    println(str3) // it will work

    // safe casting
    var obj5 : Any = "Hello"
    var str5: String? = obj5 as? String
    var str6: Int? = obj5 as? Int
    println(str5) // will work
    println(str6) // null

    // in kotlin implicit conversion is not allowed
    var a: Int = 10
    var b: Long = a.toLong()
    println(b)

    var obj9: String = "10"
    var obj10 = obj9.toInt()

    println(obj10)

}