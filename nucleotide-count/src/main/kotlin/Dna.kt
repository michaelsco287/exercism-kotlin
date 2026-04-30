class Dna(val chain: String) {

    val nucleotideCounts: Map<Char, Int>
        get() {
            val result: MutableMap<Char, Int> = mutableMapOf('A' to 0, 'C' to 0, 'G' to 0, 'T' to 0)
            for(i in chain){
                println("$i in chain: $chain")
                println("result.keys = ${result.keys}")
                require(i in result.keys)
                result.compute(i){_, value -> value?.plus(1) }
            }
            return result
        }
}
