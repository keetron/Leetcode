package nl.tnca

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SubSetXORTotalsKtTest {

    @Test
    fun subsetXORSumTest() {

    }

    @Test
    fun calculateXORSumTest() {
        assertEquals(0, calculateXORSum(emptyList()))
        assertEquals(3, calculateXORSum(listOf(3)))
        assertEquals(6, calculateXORSum(listOf(6)))
        assertEquals(2, calculateXORSum(listOf(1,3)))
        assertEquals(2, calculateXORSum(listOf(5,1,6)))
    }

    @Test
    fun createSubSetsTest() {
        val input = intArrayOf(5,1,6)
        val result = createSubSets(input)
        assertEquals(result.size, 8)
    }
}