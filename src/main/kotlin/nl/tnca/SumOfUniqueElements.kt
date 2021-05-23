package nl.tnca

fun sumOfUnique(nums: IntArray): Int {
    val encountered: MutableSet<Int> = mutableSetOf()
    val uniqueList = mutableListOf<Int>()

    nums.forEach {
        if (encountered.contains(it)) {
            uniqueList.remove(it)
        } else {
            encountered.add(it)
            uniqueList.add(it)
        }
    }

    return uniqueList.sum()
}