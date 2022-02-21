package com.example.kotlinpractice
//enum(enumerations) class -> 열거형 클래스

fun main(){
    val color=Color.RED
    when(color){
        Color.RED ->{
            println(Color.RED.rgb)
        }
        Color.GREEN ->{
            println(Color.GREEN.rgb)
        }
        Color.BLUE ->{
            println(Color.BLUE.rgb)
        }
    }
    println(Device.DEVICEON.status)
}
enum class Color(var rgb : String){
    RED("빨"),
    GREEN("초"),
    BLUE("파")
}
enum class Device(var status:String){
    DEVICEON("ON"),
    NETWORK("OFF"),
    LOVATION("SEOUL")
}