package com.dranoer.codingchallenges.array

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must appear as many times as it shows in both arrays and
 * You may return the result in any order.
 * Example:
 *  Input: nums1 = [1,2,2,1], nums2 = [2,2]
 *  Output: [2,2]
 */

fun main() {
    intersect(nums1 = intArrayOf(1, 2, 2, 1), nums2 = intArrayOf(2, 2))
}

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val result = mutableListOf<Int>()
    val map = mutableMapOf<Int, Int>()

    nums1.forEach {
        map[it] = (map[it] ?: 0) + 1
    }

    nums2.forEach {
        var count = map[it] ?: 0
        if (count > 0) {
            result.add(it)
            map[it] == --count
        }
    }

    return result.toIntArray()
}