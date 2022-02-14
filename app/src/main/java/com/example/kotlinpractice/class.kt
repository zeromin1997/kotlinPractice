package com.example.kotlinpractice

fun main(){
    //println(test().test1)
    //println(MyInfo().getName() + MyInfo().getAge())
    //println(Dog("Youngjin",26).Doginfo())
    //initTest().testInitFun()
    InitialValue("김영민",26)
    InitialValue("박보검")
}
class InitialValue(name : String, age : Int= 20){
    init{
        println(name)
        println(age)
    }
}
class initTest(){
    init{
        println("하고싶다")
    }
    fun testInitFun(){
        println("함수 출력")
    }
}
class Dog(name : String, age : Int){
    val DogName = name
    val DogAge = age
    fun Doginfo() : String{
        return "{$DogName}은 {$DogAge}살 입니다."
    }
}

class MyInfo(){
    fun getName():String{
        return "KYM"
    }
    fun getAge():Int{
        return 26
    }
}

class test(){
    val test1="안녕하세여"

}