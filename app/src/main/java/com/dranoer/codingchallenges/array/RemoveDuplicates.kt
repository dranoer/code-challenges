package com.dranoer.codingchallenges.array

/**
 * Given an integer array nums sorted in non-decreasing order,
 * remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same.
 * Then return the number of unique elements in nums.
 */

fun main() {
    removeDuplicates(nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4))
}

fun removeDuplicates(nums: IntArray): Int {
    if (nums.size < 2) return nums.size

    var count = 1

    for (i in 1 until nums.size) {
        if (nums[i] != nums[i - 1]) {
            nums[count] = nums[i]
            count++
        }
    }

    return count
}