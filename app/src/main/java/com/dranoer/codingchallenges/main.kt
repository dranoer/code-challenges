package com.dranoer.codingchallenges

fun main() {

    print("Enter Rectangle A info: ")
    val ax1 = readLine()?.toIntOrNull()
    val ax2 = readLine()?.toIntOrNull()
    val ay1 = readLine()?.toIntOrNull()
    val ay2 = readLine()?.toIntOrNull()

    print("Enter Rectangle B info: ")
    val bx1 = readLine()?.toIntOrNull()
    val bx2 = readLine()?.toIntOrNull()
    val by1 = readLine()?.toIntOrNull()
    val by2 = readLine()?.toIntOrNull()


    val result = recIntersect(
        A = Rectangle(ax1!!, ax2!!, ay1!!, ay2!!),
        B = Rectangle(bx1!!, bx2!!, by1!!, by2!!)
    )

    println("This is $result that rectangle A & B have intersect")
}

data class Rectangle(val x1: Int, val x2: Int, val y1: Int, val y2: Int)

fun recIntersect(
    A: Rectangle,
    B: Rectangle
): Boolean {

    return (A.x1 < B.x2 && B.x1 < A.x2 && A.y1 < B.y2 && B.y1 < A.y2)
}