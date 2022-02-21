package com.example.kotlinpractice
//지연초기화
//lateinit : 서버에서 받아온 데이터를 넣어두고 싶은데,
// 미리 변수를 선언해주고, 서버에서 값을 받아 올 때 주로 사용됨.
//lazy : 사용하지 않을 때, 컴퓨터에 부담을 덜 주기위해, 사용할 때만 활용
//차이점 : lateinit는 변경이 가능, lazy는 변경 불가능
fun main(){
    lateinit var lateString : String
    lateString = "안녕하세용"

    val lazyString : String by lazy{
        println("시작 할 때 프린트")
        "안녕하세용~"
    }
    lazyString
    println(lateString)
    println(lazyString)
}