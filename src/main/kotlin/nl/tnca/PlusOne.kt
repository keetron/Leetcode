package nl.tnca

import java.math.BigInteger

/**
 * This is not brute forced using a ton of traversals, it can probably be improved using recursing and stepping back through the array
 * Still leaves me with a [9, 9] situation that I would not know how to handle.
 * But admittedly, the below is slow, I might come back one day and improve it.
 */
fun plusOne(digits: IntArray): IntArray {
    return if (digits[digits.lastIndex] == 9) {
        var ints = IntArray(digits.size + 1).apply {
            var s = ""
            digits.forEach { s = s.plus(it.toString()) }
            var outcome = s.toBigInteger().plus(BigInteger.ONE)
            val list = mutableListOf<Int>()
            while (outcome > BigInteger.ZERO) {
                list.add(outcome.remainder(BigInteger.TEN).toInt())
                outcome = outcome.divide(BigInteger.TEN)
            }
            for (i in list.indices) {
                set(i, list[i])
            }
        }.reversedArray()

        if (ints.size > 1 && ints.first() == 0) {
            ints = ints.drop(1).toIntArray()
        }

        ints
    } else {
        digits[digits.lastIndex] = digits.last() + 1
        digits
    }
}