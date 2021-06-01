package nl.tnca

import kotlin.math.absoluteValue

fun reverse(x: Int): Int {
    if (x==0) return 0
    var rest = if (x < 0) x.absoluteValue else x
    var result = 0
    while (rest > 0) {
        if (Int.MAX_VALUE/10 <= result) return 0
        result *= 10
        val lastDigit = rest % 10
        result += lastDigit
        rest /= 10
    }

    return if (x < 0) result * -1 else result

}