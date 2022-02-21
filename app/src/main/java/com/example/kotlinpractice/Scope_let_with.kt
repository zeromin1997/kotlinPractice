package com.example.kotlinpractice
//let -> non null 일 때 동작하고, null일 때 동작하지 않음.
//with -> 컨텍스트 내부에서 함수를 호출
//run -> 객체 초기화와 리턴값 계산이 필요할 때 사용
//apply -> 값을 반환하지 않고, 객체 구성에 대해 사용
//also -> 객체에 대해 추가적인 작업
fun main(){
    //let
    val str:String? ="Hi"
    val length = str?.let{
        println(it)
        it.length
    }
    println(length)
    val str1:String? =null
    val length2 = str1?.let{
        println(it)
        it.length
    } // null값이므로 it이 출력이 안됨
    println(length2)
    //with
    val numbers = mutableListOf("a","b","c","d")
    println(numbers.first())
    println(numbers.last())
    val firstAndLast = with(numbers){
        "${first()} ${last()}"
    }
    println(firstAndLast)
}