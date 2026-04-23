object CollatzCalculator {
    fun computeStepCount(start: Int): Int {
        require(start >= 1) { "Invalid start: $start" }
        var num = start
        var steps = 0
        while (num != 1){
            num = computeNext(num)
            steps += 1
        }
        return steps
    }

    fun computeNext(num: Int): Int {
        return if (num % 2 == 0){
            num / 2
        } else {
            num * 3 + 1
        }
    }
}
