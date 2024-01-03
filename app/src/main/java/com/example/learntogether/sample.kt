package com.example.learntogether

fun main() {
    println(1 == 1)
    println(1 < 1)
    val trafficRightColor = "Black";

    when (trafficRightColor) {
        "Red" -> println("Stop")
        "Yellow" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-right color")
    }
}