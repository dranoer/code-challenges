package com.dranoer.codingchallenges

/*
    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    example:
        Input: nums = [1,2,3,2,1,4,3]
        Output: 4
 */

fun main() {
    val nums = intArrayOf(1, 2, 3, 2, 1, 4, 3)
    println(singleNumber(nums = nums))
}

fun singleNumber(nums: IntArray): Int {

    var result = 0
    for (item in nums) {
        result = result xor item
    }

    return result
}