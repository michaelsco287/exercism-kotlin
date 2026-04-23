object ETL {
    fun transform(source: Map<Int, Collection<Char>>): Map<Char, Int> {
        val output = mutableMapOf<Char, Int>()
        for((score, characters) in source ){
            for (char in characters) {
                val key: Char = char.lowercaseChar()
                output[key] = score
            }
        }
        return output
    }
}
