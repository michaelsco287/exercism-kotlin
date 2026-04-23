import kotlin.math.sqrt

object Darts {

    fun score(x: Number, y: Number): Int {
        val xSquared = x.toDouble() * x.toDouble()
        val ySquared = y.toDouble() * y.toDouble()
        val radius = sqrt(xSquared + ySquared)
        return when {
            radius <=  1 -> 10
            radius <= 5 -> 5
            radius <= 10 -> 1
            else -> 0
        }
    }
}
