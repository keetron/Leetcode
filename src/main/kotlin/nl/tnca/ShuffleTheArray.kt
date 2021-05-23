package nl.tnca

class ShuffleTheArray {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val list: MutableList<Int> = mutableListOf()
        for (i in 0 until n){
            list.add(nums[i])
            list.add(nums[n+i])
        }
        return list.toIntArray()
    }
}