package com.example.kotlinpractice
//람다 ->
fun main(){
    println(a())
    println(sumNumber(1,2))
    println(sumNumber2(1,2))
    println(sumTypeNumber(1,2))
    println(sumTypeNull(1,2))
    println(sunString("영진","상훈"))
}
fun a():String{
    return "test"
}

val sumNumber2={a:Int, b:Int -> a+b}
val sumTypeNumber : (Int,Int) -> Int ={a,b -> a+b}
val sumTypeNull : (Int,Int) -> Int? ={a,b -> null}
val sunString : (String, String) -> String = {a,b -> "$a 는 $b 이다."}
fun sumNumber(a: Int, b: Int) : Int{
    return a+b
}
