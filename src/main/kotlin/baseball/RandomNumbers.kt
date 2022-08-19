package baseball

object RandomNumbers {
    fun createNumbers(): List<Number> {
        return Numbers.putNumbersOnList().shuffled().subList(CROP_THE_START_NUMBER, CROP_THE_END_NUMBER)
    }

    private const val CROP_THE_START_NUMBER = 0
    private const val CROP_THE_END_NUMBER = 3
}