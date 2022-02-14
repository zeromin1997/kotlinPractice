package com.example.kotlinpractice
//중첩 클래스 (Nested Class) = 객체지향 /캡슐화
//내부 클래스 (Inner Class) = RecyclerView
fun main(){
    val test1 = Test1.Test1NestedClass()
    test1.testfun1()
    val test2 = Test2().Test2InnerClass()
    test2.testfun2()
}
class Test1(){
    val tt = "tt"
    class Test1NestedClass{
        fun testfun1(){
            println("중첩클래스")
            //println(tt)
        }
    }
}
class Test2{
    val kk = "kk"
    inner class Test2InnerClass{
        fun testfun2(){
            println("내부클래스")
            println(kk)
        }
    }
}

