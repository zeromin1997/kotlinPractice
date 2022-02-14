package com.example.kotlinpractice
//Overloading
fun main(){
    val c=Calculator()
    c.sumNumberTwo(1,2)
    c.sumNumber("안녕","하세여")
}

class Calculator(){
    fun sumNumberTwo(a : Int, b:Int){
        println(a+b)
    }
    fun sumNumberThree(a:Int,b:Int,c:Int){
        println(a+b+c)
    }
    fun sumNumber(a : Int, b:Int){
        println(a+b)
    }
    fun sumNumber(a : Int, b:Int, c: Int){
        println(a+b+c)
    }
    fun sumNumber(str1 : String, str2 : String){
        println(str1+str2)
    }
}