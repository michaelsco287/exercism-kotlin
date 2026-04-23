import java.math.BigInteger

object Board {

    fun getGrainCountForSquare(number: Int): BigInteger {
        require((number >= 1) and (number <= 64)) { "Invalid square: $number" }
        return 2.toBigInteger().pow(number-1)
    }

    fun getTotalGrainCount(): BigInteger {
        var total: BigInteger = BigInteger.ZERO
        for (num in 1..64){
            total += getGrainCountForSquare(num)
        }
        return total
    }
}
