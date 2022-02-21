package com.example.kotlinpractice
// infix function

fun main(){
    println("안녕" sum1 "하세요")
    println(12 sum2 23)
    println(20 showList 30)
}
infix fun String.sum1(abc:String):String = this + abc
infix fun Int.sum2(int:Int):Int = this+int
infix fun Int.showList(abc:Int) :List<Int>{
    val list=mutableListOf<Int>()
    for (i in this..abc){
        list.add(i)
    }
    return list
}