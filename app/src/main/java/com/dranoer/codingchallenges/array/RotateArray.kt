package com.dranoer.codingchallenges.array

/*
    Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
    Example:
        Input: nums = [1,2,3,4,5,6,7], k = 3
        Output: [5,6,7,1,2,3,4]
    Explanation:
        rotate 1 steps to the right: [7,1,2,3,4,5,6]
        rotate 2 steps to the right: [6,7,1,2,3,4,5]
        rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */

fun main() {
    val nums = intArrayOf(1,2,3,4,5,6,7)
    val k = 3
    rotate(nums, k)
    println(nums.contentToString()) // It should print: [5, 6, 7, 1, 2, 3, 4]
}

fun rotate(nums: IntArray, k: Int): Unit {

    val n = nums.size
    val rotated = IntArray(n)

    for (i in nums.indices) {
        rotated[(i + k) % n] = nums[i]
    }

    for (i in nums.indices) {
        nums[i] = rotated[i]
    }
}