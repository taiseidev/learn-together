package com.example.learntogether

fun main() {
    println(1 == 1)
    println(1 < 1)
    val trafficRightColor = "Black";
    if (trafficRightColor == "Red") {
        println("Stop")
    } else if (trafficRightColor == "Yellow") {
        println("Slow")
    } else if (trafficRightColor == "Green") {
        println("Go")
    } else {
        println("Invalid traffic-right color")
    }
}