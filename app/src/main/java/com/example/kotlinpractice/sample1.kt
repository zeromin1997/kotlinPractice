package com.example.kotlinpractice
//맵 반복문 적요
fun main(){
    val test= mutableMapOf<Int,String>()
        test[1]="철수"
        test[2]="유리"
        test[3]="배수"
        test[10]="영진"
        test[5]="영민"
        test[100]="상훈"
        for(i in test){
            var key=i.key
            var value=i.value
            println("$key 번은 $value 이다")

        }
}