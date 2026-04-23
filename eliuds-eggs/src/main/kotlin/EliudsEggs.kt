object EliudsEggs {

    fun eggCount(number: Int): Int{
        val binaryString = Integer.toBinaryString(number)
        var eggs = 0
        for (char in binaryString) {
            if (char == '1'){
                eggs += 1
            }
        }
        return eggs
    }
}
