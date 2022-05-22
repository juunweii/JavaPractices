package com.juunweii.prac.student


fun main(args: Array<String>) { //用"main"快速產生main

    val stu = Student("Tom", 80, 90)

    stu.print()

}


class Student(var name:String, var english:Int , var math:Int){


    fun print(){
        println("Name: "+name+"\n"+english+"\t"+math)
    }

}