package com.alphadev.kotlin.day3

fun main() {
    var str1 = ""
    //str1 = null

    var str2: String
    str2 = ""
//    str2 = null  Since we have not declared a variable as nullable we can not store null value

//    var str3: String = null  compile time error

    var str4: String?
    str4 = null

    var str5: String? = null
    var str6: String? = "Bhaskar Kulkarni"
    str6 = null

    var name: String? = " Bhaskar Kulkarni"
    println(name?.length)

    if(name != null) {
        println(name.length)
    }

}