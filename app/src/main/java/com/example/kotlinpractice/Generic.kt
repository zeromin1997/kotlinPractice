package com.example.kotlinpractice
//제네릭 : 타입을 먼저 지정하지 않고, 넣는 값에 따라 타입이 바뀜.
fun main(){
    val box1=Box1("010")
    println(box1.value)
    testFun(100)
}
fun <T> testFun(a:T){
    println(a)
}
class Box1<T>(test:T){
    var value = test
}