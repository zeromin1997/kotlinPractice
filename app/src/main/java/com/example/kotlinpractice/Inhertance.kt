package com.example.kotlinpractice
//상속 inhertance

fun main(){
    job1()
    job2()
    job3()
    job4()
}
open class Alljobs(){
    init{
        println("난 일하기 전에")
    }
}
class job1() : Alljobs() {
    init{
        println("공부한다.")
    }
}
class job2(){
    init{
        println("코딩한다.")
    }
}
class job3(){
    init{
        println("게임한다.")
    }
}
class job4(): Alljobs(){
    init{
        println("연애한다.")
    }
}