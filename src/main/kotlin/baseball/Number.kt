package baseball

import baseball.ErrorMessage.NUMBER_SCOPE_ONE_NINE

class Number(number: Int) {

    init {
        require(number in MINIMUM_NUMBER..MAXIMUM_NUMBER) {
            throw IllegalArgumentException(NUMBER_SCOPE_ONE_NINE)
        }
    }

    companion object {
        const val MINIMUM_NUMBER = 1
        const val MAXIMUM_NUMBER = 9
    }
}
