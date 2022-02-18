package com.example.kotlinpractice

fun main(){
    testSum(1,2, {a:Int,b:Int -> a+b})
    testSum(1,2,::test)
}
fun testSum(a : Int, b:Int, operation : (Int,Int)-> Int ){
    println("$a $b")
    println(operation(a,b))
}
fun test(a: Int, b: Int):Int{
    return a+b
}