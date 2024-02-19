package com.alphadev.kotlin.day4

abstract class A {
    abstract fun test1()
}
abstract class B : A() {
    abstract fun  test2()
}

abstract class C : B() {
    abstract fun test3()
}

class Output3: C() {
    override fun test3() {
        TODO("Not yet implemented")
    }

    override fun test2() {
        TODO("Not yet implemented")
    }

    override fun test1() {
        TODO("Not yet implemented")
    }

}