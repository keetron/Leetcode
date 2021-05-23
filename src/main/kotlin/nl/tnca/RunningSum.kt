package nl.tnca

fun runningSum(nums: IntArray): IntArray {
    val result = IntArray(nums.size)
    var total = 0
    for (i in nums.indices) {
        total += nums[i]
        result[i] = total
    }
    return result
}