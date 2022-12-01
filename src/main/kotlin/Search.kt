import kotlin.math.sqrt

class Search {

    companion object {
        fun twoCrystalBalls(input: Array<Boolean>): Int {
            val stepSize = sqrt(input.size.toDouble()).toInt()
            var curIdx = stepSize
            while (!input[curIdx])
                curIdx += stepSize
            curIdx -= stepSize
            while (!input[curIdx])
                curIdx++
            return curIdx
        }

        fun binarySearch(input: Array<Int>, target: Int): Int {
            var lo = 0
            var hi = input.size
            while (lo < hi) {
                val mid = lo + (hi - lo) / 2
                if (input[mid] == target) {
                    return mid
                } else if (input[mid] < target) {
                    lo = mid + 1
                } else {
                    hi = mid
                }
            }
            return -1
        }
    }
}