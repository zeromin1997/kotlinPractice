package com.example.kotlinpractice
//Object -> 싱글톤패턴 > 디자인 패턴 중 하나
//디자인 패턴 -> 코드를 어떻게 짜는게 더 좋고, 어떤 방식으로 구성해야 유지보수가 쉬운가.
//객체를 한개만 생성하도록 한다. 전역으로 사용 가능
fun main(){
    /*var test1=TestClass()
    var test2=TestClass()
    var test3=TestObject
    var test4=TestObject
    test1.count=10
    test2.count=0
    test3.count=20
    test4.count=40
    println(test1.count)
    println(test2.count)
    println(test3.count)
    println(test4.count)*/
    var test5=TestObjectClass()
    var test6=TestObjectClass()
    test5.plus()
    println(TestObjectClass.number)
    test6.minus()
    println(TestObjectClass.number)
}
class TestObjectClass(){
    companion object{
        var number=0
    }
    fun plus(){
        number++
    }
    fun minus(){
        number--
    }
}
class TestClass(){
    init{
        println("테스트 클래스")
    }
    var count=0
}
object TestObject{
    init{
        println("테스트 오브젝트")
    }
    var count = 0
}