package baseball

import baseball.ErrorMessage.NUMBER_SCOPE_ONE_NINE
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.inspectors.forAll
import io.kotest.matchers.throwable.shouldHaveMessage

internal class NumberTest : BehaviorSpec({

    given("validation number") {
        `when`("번호가 음수일 경우") {
            then("예외케이스 발생") {
                negative.forAll {
                    shouldThrow<IllegalArgumentException> {
                        Number(it)
                    }.shouldHaveMessage(NUMBER_SCOPE_ONE_NINE)
                }
            }
        }

        `when`("번호가 9보다 클 경우") {
            then("예외케이스 발생") {
                exceedNumber.forAll {
                    shouldThrow<IllegalArgumentException> {
                        Number(it)
                    }.shouldHaveMessage(NUMBER_SCOPE_ONE_NINE)
                }
            }
        }
    }
}) {
    companion object {
        private val negative = listOf(0, -1, -100, -1000)
        private val exceedNumber = listOf(10, 100, 1000)
    }
}