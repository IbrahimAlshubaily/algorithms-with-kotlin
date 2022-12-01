import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SearchTest {
    @Test
    fun twoGlassSearchTest() {
        val input = Array(100) { idx -> idx >= 69 }
        assertEquals(Search.twoCrystalBalls(input), 69)
    }

    @Test
    fun binarySearchTest() {
        val input = Array(100) { idx -> idx }
        assertEquals(Search.binarySearch(input, -1), -1)
        for (v in input)
            assertEquals(Search.binarySearch(input, v), v)
        assertEquals(Search.binarySearch(input, 100), -1)
    }
}