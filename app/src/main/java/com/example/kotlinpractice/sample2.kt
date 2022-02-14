package com.example.kotlinpractice
//엘비스 연산자
fun main(){
    println(findStringLength("21231"))
}

fun findStringLength(str : String?) : Int{
    return str?.length ?: 0 // null값일 때, 리턴값을 0 으로 출력 << 엘비스 연산자
}

