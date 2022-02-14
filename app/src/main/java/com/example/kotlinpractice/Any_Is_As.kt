package com.example.kotlinpractice
//Any -> 모든 아이들을 포함할 수 있는 조상같은 친구
//Is -> 맞는지 확인
//as -> type casting -> 타입 변경/체크
fun main(){
    var str1 : Any="abc"
    println(str1)
    str1 =123
    println(str1)

    if(str1 is String){
        println("This is String")
    }else{
        println("This is not String")
    }

    val str2 : Any = "Stt"
    when(str2){
        is Int ->{println("This is Int")}
        is String -> {println("This is String")}
        else -> {
            println("This is else")
        }
    }
    val str3 : String ="abc"
    val str4 : String =str3 as String
    println(str4)
    val str5 : Int = 123
    var str6 : String = str5 as String
    println(str6)
    val str7 : String? ="abc" as? String
    println(str7)
}