object Bob {
    fun hey(input: String): String {
        if (input.isBlank()) {
            return "Fine. Be that way!"
        }
        else if (isAllCaps(input) and isQuestion(input)){
            return "Calm down, I know what I'm doing!"
        }
        else if (isAllCaps(input)){
            return "Whoa, chill out!"
        }
        else if (isQuestion(input)){
            return "Sure."
        }
        return "Whatever."
    }

    fun isAllCaps(input: String): Boolean {
        return input == input.uppercase()
    }

    fun isQuestion(input: String) : Boolean {
        return input[input.length - 1] == '?'
    }
}
