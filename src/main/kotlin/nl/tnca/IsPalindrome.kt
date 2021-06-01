package nl.tnca

fun isPalindrome(x: Int): Boolean {
    when {
        x < 0 -> return false
        x < 10 -> return true
        else -> {
            val str = x.toString()
            val halfLength = str.length / 2
            for (i in 0 until halfLength){
                if (str[i] != str[str.lastIndex-i] ) return false
            }
            return true
        }
    }

}