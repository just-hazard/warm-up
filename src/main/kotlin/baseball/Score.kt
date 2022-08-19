package baseball

class Score {
    private var strike = 0
    private var ball = 0

    fun calculateScore(userNumbers: MutableList<Number>, computerNumbers: List<Number>): Pair<Int, Int> {
        for (index in 0..2) {
            checkedStrike(userNumbers[index], computerNumbers[index])?.let {
                checkedBall(userNumbers, computerNumbers[index])
            }
        }

        return Pair(strike, ball).apply {
            initialize()
        }
    }

    private fun initialize() {
        strike = 0
        ball = 0
    }

    private fun checkedBall(userNumbers: MutableList<Number>, computerNumber: Number) {
        if (userNumbers.contains(computerNumber)) {
            ball = ball.plus(PLUS_NUMBER)
        }
    }

    private fun checkedStrike(userNumber: Number, computerNumber: Number): Number? {
        if (userNumber.isSameNumber(computerNumber)) {
            strike = strike.plus(PLUS_NUMBER)
            return null
        }
        return userNumber
    }
}

private const val NUMBERS_SIZE_MIN = 1
private const val NUMBERS_SIZE_MAX = 3
private const val PLUS_NUMBER = 1