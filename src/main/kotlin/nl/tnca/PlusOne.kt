package nl.tnca

fun plusOne(digits: IntArray): IntArray {
    return if (digits[digits.lastIndex] == 9) {
        val ml = mutableListOf<Int>().apply {
            var dec = true
            add(0)
            for (i in digits.lastIndex-1 downTo 0) {
                if (dec) {
                    val n = digits[i]+1
                    dec = false
                    if (n>9) {
                        add(0)
                        dec = true
                    } else add(n)
                } else {
                    add(digits[i])
                }
            }
            if (dec) add(1)
        }
        IntArray(ml.size).apply {
            for (i in ml.lastIndex downTo 0){
                set(ml.lastIndex-i, ml[i])
            }
        }


    } else {
        digits[digits.lastIndex] = digits.last() + 1
        digits
    }
}