package baseball

class Score {
    private lateinit var score: Pair<Int, Int>

    fun calculateScore(userNumbers: Numbers, computerNumbers: Numbers): Pair<Int, Int> {
        for(index in NUMBERS_SIZE_MIN..NUMBERS_SIZE_MAX) {
            checkedStrike(userNumbers.numbers[index]!!, computerNumbers.numbers[index]!!)
        }

        return score
    }

    private fun checkedStrike(userNumber: Number, computerNumber: Number) {
        if(userNumber.isSameNumber(computerNumber)) {
            score.first.plus(1)
        }
    }
}

private const val NUMBERS_SIZE_MIN = 1
private const val NUMBERS_SIZE_MAX = 3