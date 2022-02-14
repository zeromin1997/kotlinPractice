package com.example.kotlinpractice

fun main(){
    //bike().wheel()
    //Car().engine()
    BMW().wheel()
    BMW().engine()
}
abstract class Car(){
    abstract fun wheel()
    abstract fun engine()
}
class BMW() : Car(){
    override fun wheel(){
        println("굴러갑니다.")
    }
    override fun engine(){
        println("시동이 켜졌습니다.")
    }
}

/*open class Car{
    open fun wheel(){
        println("굴러갑니다.")
    }
    open fun engine(){
        println("시동이 켜졌습니다.")
    }
}
class bike() : Car(){
    override fun wheel(){
        println("자전거가 굴러가유~")
    }
}*/