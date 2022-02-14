package com.example.kotlinpractice

fun main(){
    BMW2().wheel()
    BMW2().engine()
    BMW2().autoDriving()
}

abstract class Car2(){
    abstract fun wheel()
    abstract fun engine()
}
interface CarautoDriving{
    fun autoDriving()
}
class BMW2() : Car2(), CarautoDriving{
    override fun wheel(){
        println("굴러갑니다.")
    }
    override fun engine(){
        println("시동이 켜졌습니다.")
    }
    override fun autoDriving(){
        println("자동 주행")
    }
}
