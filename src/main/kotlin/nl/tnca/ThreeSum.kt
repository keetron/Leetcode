package nl.tnca

fun threeSum(nums: IntArray): List<List<Int>> {
    if (nums.size < 3) return emptyList()
    nums.sort()

    val resultSet = HashSet<List<Int>>()

    for (i in 0 until nums.size - 2) {
        var lowIndex = i + 1
        var highIndex = nums.size - 1
        while (lowIndex < highIndex) {
            val sum = nums[i] + nums[lowIndex] + nums[highIndex]
            when {
                sum < 0 -> lowIndex++
                sum > 0 -> highIndex--
                else -> {
                    resultSet.add(listOf(nums[i], nums[lowIndex], nums[highIndex]))
                    lowIndex++
                    highIndex--
                }
            }
        }
    }
    return resultSet.toList()
}
