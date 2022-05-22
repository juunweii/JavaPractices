package com.juunweii

fun main(args: Array<String>) {
//    println("Hello Kotlin")


//    Human().hello()

    val h = Human()  //建構Human物件
    h.hello()
}

class Human{
    fun hello(){
        println("Hello Kotlin")
    }
}