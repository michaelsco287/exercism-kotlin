object Bob {
    fun hey(input: String): String {
        return when {
            input.isBlank() -> "Fine. Be that way!"
            isAllCaps(input) and isQuestion(input) -> "Calm down, I know what I'm doing!"
            isAllCaps(input) -> "Whoa, chill out!"
            isQuestion(input) -> "Sure."
            else -> "Whatever."
        }
    }

    fun isAllCaps(input: String): Boolean =
        input.any { it.isLetter() }
                && input.filter { it.isLetter() }.all { it.isUpperCase() }


    fun isQuestion(input: String) : Boolean {
        val trimmedInput = input.trimEnd()
        return trimmedInput[trimmedInput.length - 1] == '?'
    }
}
