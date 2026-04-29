data class Year(val value: Int) {

    val isLeap: Boolean = when {
        value % 400 == 0 -> true
        value % 100 == 0 -> false
        value % 4 == 0 -> true
        else -> false
    }
}
