package nl.tnca

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ReverseIntegerKtTest{

    @Test
    fun reverseTestMax(){
        val outcome4 = reverse(Int.MAX_VALUE)
        assertEquals(0, outcome4)
    }
    @Test
    fun reverseTest1(){
        val outcome = reverse(123)
        assertEquals(321, outcome)
    }
    @Test
    fun reverseTest2(){
        val outcome1 = reverse(-123)
        assertEquals(-321, outcome1)
    }

    @Test
    fun reverseTest3(){
        val outcome2 = reverse(120)
        assertEquals(21, outcome2)
    }
    @Test
    fun reverseTest4(){
        val outcome3 = reverse(0)
        assertEquals(0, outcome3)
    }
}