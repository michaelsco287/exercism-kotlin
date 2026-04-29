object Isogram {

    fun isIsogram(input: String): Boolean {
        val letters: MutableSet<Char> = mutableSetOf()
        for(i in input.lowercase()){
            if (i.isLetter() && !letters.add(i)){
                return false
            }
        }
        return true
    }
}
