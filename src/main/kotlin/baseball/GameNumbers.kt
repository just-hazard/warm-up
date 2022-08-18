package baseball

class GameNumbers {
    private val numbers = arrayListOf<Number>()

    fun addNumber(numbers: List<Number>) {
        if (numbers.size == NUMBER_LENGTH) {
            this.numbers.addAll(numbers)
            return
        }

        throw IndexOutOfBoundsException(ErrorMessage.NUMBER_LENGTH_THREE)
    }

    companion object {
        private const val NUMBER_LENGTH = 3
    }
}