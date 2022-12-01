import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SearchTest {
    @Test
    fun twoGlassSearchTest() {
        val input = Array<Boolean>(100) { idx -> idx >= 69 }
        assertEquals(Search.twoCrystalBalls(input), 69)
    }
}