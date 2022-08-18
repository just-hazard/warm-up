package baseball

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.inspectors.forAll
import io.kotest.matchers.throwable.shouldHaveMessage

internal class GameNumbersTest : BehaviorSpec({
    given("game numbers") {
        val numbers = GameNumbers()
        `when`("숫자 길이가 3이 아닐 경우") {
            then("예외케이스 발생") {
                makeNumbers.forAll {
                    shouldThrow<IndexOutOfBoundsException> {
                        numbers.addNumbers(it)
                    }.shouldHaveMessage(ErrorMessage.NUMBER_LENGTH_THREE)
                }
            }
        }
    }
}) {
    companion object {
        private val makeNumbers = listOf<List<Number>>(
            listOf(Number(1), Number(2)),
            listOf(),
            listOf(Number(1), Number(2), Number(3), Number(4))
        )
    }
}