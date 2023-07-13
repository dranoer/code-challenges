package com.dranoer.codingchallenges.interview

/*
    Find out if two given rectangle
    have any intersects
*/

fun main() {

    val rectA = promptForRectangle("A")
    val rectB = promptForRectangle("B")
    val result = rectA.intersects(rectB)

    println("This is $result that rectangle A & B have intersect")
}

data class Rectangle(val x1: Int, val x2: Int, val y1: Int, val y2: Int) {
    fun intersects(other: Rectangle): Boolean {

        return (x1 < other.x2 && other.x1 < x2 && y1 < other.y2 && other.y1 < y2)
    }
}

private fun promptForRectangle(label: String): Rectangle {
    print("Enter $label rectangle info (format: x1, x2, y1, y2)")
    val (x1, x2, y1, y2) = readLine()!!.split(' ').map(String::toInt)
    return Rectangle(x1 = x1, x2 = x2, y1 = y1, y2 = y2)
}