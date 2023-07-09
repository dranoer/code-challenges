package com.dranoer.codingchallenges

fun main() {

    val result = recIntersect(
        A = Rectangle(x1 = 1, y1 = 1, x2 = 2, y2 = 2),
        B = Rectangle(x1 = 3, y1 = 1, x2 = 4, y2 = 2),
    )

    println(result)
}

data class Rectangle(val x1: Int, val y1: Int, val x2: Int, val y2: Int)

fun recIntersect(
    A: Rectangle,
    B: Rectangle
): Boolean {

    return (A.x1 < B.x2 && B.x1 < A.x2 && A.y1 < B.y2 && B.y1 < A.y2)
}