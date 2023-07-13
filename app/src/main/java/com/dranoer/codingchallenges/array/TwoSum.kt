package com.dranoer.codingchallenges.array

/*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    Example:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

fun main() {

    val indexes = twoSum(nums = intArrayOf(2, 7, 11, 15), target = 9)
    val prettyIndexes = indexes.joinToString(prefix = "[", postfix = "]")
    println("Output: $prettyIndexes")
}

fun twoSum(nums: IntArray, target: Int): IntArray {

    val map = HashMap<Int, Int>() // Number we process already and their indices

    for ((index, num) in nums.withIndex()) {
        val complement = target - num

        map[complement]?.let {
            return intArrayOf(it, index)
        }

        map[num] = index // Storing each number and its index in the map as it iterates through the array.
    }

    throw IllegalArgumentException("No two sum solution for array: ${nums.contentToString()} and target: $target")
}
