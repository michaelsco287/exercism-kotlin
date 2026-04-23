object ETL {
    fun transform(source: Map<Int, Collection<Char>>): Map<Char, Int> = buildMap{
        for((score, characters) in source){
            for (char in characters) {
                val key: Char = char.lowercaseChar()
                this[key] = score
            }
        }
    }
}
