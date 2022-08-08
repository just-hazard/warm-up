package baseball

object Numbers {
    private val numbers = mutableMapOf<Int, Number>()

    init {
        for(index in Number.MINIMUM_NUMBER .. Number.MAXIMUM_NUMBER) {
            numbers[index] = Number(index)
        }
    }
}