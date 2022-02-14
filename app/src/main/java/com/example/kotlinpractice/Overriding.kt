package com.example.kotlinpractice

fun main(){
    Parents().disease()
    Parents().doing()
    Child().disease()
    Child().doing()
}
open class Parents(){
    fun doing(){
        println("아이를 돌봄")
    }
    open fun disease(){
        println("비염")
    }
}
class Child():Parents(){
    override fun disease(){
        println("변비")
    }
}