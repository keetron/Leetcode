package nl.tnca

import kotlin.math.pow


fun subsetXORSum(nums: IntArray): Int {
    var res = 0
    var j: Int
    val cnt = 2.0.pow(nums.size.toDouble()).toInt()
    for (i in 0 until cnt) {
        var res2 = 0
        j = 0
        while (j < nums.size) {
            if (i and (1 shl j) != 0) res2 = res2 xor nums[j]
            j++
        }
        res += res2
    }
    return res
}

