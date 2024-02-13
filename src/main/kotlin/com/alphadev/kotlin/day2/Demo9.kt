package com.alphadev.kotlin.day2

class Employee4(f: String, l:String) {
    // init block will be executed in same order so we should declare after we declare properties
  /*  init {
        firstName = f;
        lastName = l;
    }*/

    var firstName = ""
    var lastName = ""

    fun getFullName() {
        println("$firstName $lastName")
    }
}