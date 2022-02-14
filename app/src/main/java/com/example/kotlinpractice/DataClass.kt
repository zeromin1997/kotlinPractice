package com.example.kotlinpractice

fun main(){
    val justDog=JustDog("파트라슈",15)
    println(justDog.name)
    println(justDog.age)
    println(justDog.toString())
    val dataDog=DataDog("파트라슈 친구",15)
    println(dataDog.name)
    println(dataDog.age)
    println(dataDog.toString())
    println(dataDog.copy("파트라슈 여자친구"))
}
class JustDog(var name : String, var age : Int)
data class DataDog(var name : String, var age : Int)