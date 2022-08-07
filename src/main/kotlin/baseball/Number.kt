package baseball

import baseball.ErrorMessage.NUMBER_SCOPE_ONE_NINE

class Number(number: Int) {

    init {
        require(number in MINUMUM_NUMBER..MAXIMUM_NUMBER) {
            throw IllegalArgumentException(NUMBER_SCOPE_ONE_NINE)
        }
    }

    companion object {
        private val MINUMUM_NUMBER = 1
        private val MAXIMUM_NUMBER = 9
    }
}

