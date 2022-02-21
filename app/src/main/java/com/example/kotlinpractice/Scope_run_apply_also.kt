package com.example.kotlinpractice

fun main(){
    //run
    val service= multiPortService("www.naver.com",80)
    val result1 = service.query(service.prepareRequest()+" to port ${service.port}")
    println(result1)
    val result2 = service.run(){
        port=8080
        query(prepareRequest()+" to port $port")
    }
    println(result2)
    //apply
    val tester1=Person("tester1")
    tester1.age=20
    tester1.city="Seoul"
    println(tester1)
    val tester2=Person("tester2").apply{
        age=21
        city="Busan"
    }
    println(tester2)
    //also
    val numbers = mutableListOf(1,2,3,4)
    println("$numbers 여기서 5를 추가합니다.")
    numbers.add(5)
    println(numbers)
    val numbers2= mutableListOf(1,2,3,4)
    numbers2.also{
        println("$numbers2 여기서 5를 추가합니다.")
    }.add(5)
    println(numbers2)

}
data class Person(
    var name:String,
    var age:Int=0,
    var city:String=""
)
class multiPortService(var url: String, var port:Int){
    fun prepareRequest() : String = "기본 요청 url $url"
    fun query(request : String)="결과 query $request"
}
