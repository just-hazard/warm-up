package baseball

object Numbers {
    val numbers = mutableMapOf<Int, Number>()

    init {
        for (index in Number.MINIMUM_NUMBER..Number.MAXIMUM_NUMBER) {
            numbers[index] = Number(index)
        }
    }

    fun confirmNumber(inputNumber: Int): Number {
        require(numbers.containsKey(inputNumber).not()) {
            return numbers[inputNumber]!!
        }

        throw IllegalArgumentException(ErrorMessage.NUMBER_SCOPE_ONE_NINE)
    }
}