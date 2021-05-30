package nl.tnca.codility

fun solution(A: IntArray): Int {
    val sorted = A.toSortedSet()
    val highest = sorted.last()
    if (highest < 1) return 1

    var counter = 1
    sorted.filter { it > 0 }
        .forEach {
            if (counter != it ) return counter else {
                counter += 1
            }
        }


    return counter
}