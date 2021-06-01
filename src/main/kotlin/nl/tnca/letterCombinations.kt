package nl.tnca

fun letterCombinations(digits: String): List<String> {
    if (digits.isBlank()) return listOf("")

    val digitMapping: Map<Char, String> = mapOf(
        '2' to "abc",
        '3' to "def",
        '4' to "ghi",
        '5' to "jkl",
        '6' to "mno",
        '7' to "pqrs",
        '8' to "tuv",
        '9' to "wxyz"
    )

    var combinations: List<String> = listOf("")
    digits.forEach { s: Char ->
        val temp : MutableList<String> = mutableListOf()
        digitMapping[s]!!.forEach { c: Char ->
            combinations.forEach {
                temp.add(it+c)
            }
        }
        combinations = temp
    }

    return combinations
}