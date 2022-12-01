import kotlin.math.sqrt

class Search {

    companion object{
        fun twoCrystalBalls(input: Array<Boolean>): Int{
            val stepSize = sqrt(input.size.toDouble()).toInt()
            var curIdx = stepSize
            while (!input[curIdx])
                curIdx += stepSize
            curIdx -= stepSize
            while (!input[curIdx])
                curIdx++
            return curIdx
        }
    }
}