package com.example.learntogether

fun main() {

    val trafficLightColor = "Black"

    val message = if (trafficLightColor == "Red") "Stop"
    else if (trafficLightColor == "Yellow") "Slow"
    else if (trafficLightColor == "Green") "Go"
    else "Invalid traffic-light color"

    println(message)

//    val trafficLightColor = "Amber"
//
//    when (trafficLightColor) {
//        "Red" -> println("Stop")
//        "Yellow", "Amber" -> println("Slow")
//        "Green" -> println("Go")
//        else -> println("Invalid traffic-light color")
//    }

//    val x: Any = 20;
//
//    when (x) {
//        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
//        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
//        is Int -> println("x is an integer number, but not between 1 and 10.")
//        else -> println("x isn't a prime number between 1 and 10.")
//    }
//    println(1 == 1)
//    println(1 < 1)
//    val trafficRightColor = "Black";
//
//    when (trafficRightColor) {
//        "Red" -> println("Stop")
//        "Yellow" -> println("Slow")
//        "Green" -> println("Go")
//        else -> println("Invalid traffic-right color")
//    }
}