package baseball

class GameNumbers {
    private val numbers = mutableListOf<Number>()

    fun addNumbers(numbers: MutableList<Number>) {
        if (numbers.size == NUMBER_LENGTH) {
            this.numbers.addAll(numbers)
            return
        }

        throw IndexOutOfBoundsException(ErrorMessage.NUMBER_LENGTH_THREE)
    }

    fun getNumbers() : MutableList<Number> {
        return numbers
    }

    companion object {
        private const val NUMBER_LENGTH = 3
    }
}