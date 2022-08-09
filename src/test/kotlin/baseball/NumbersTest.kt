package baseball

import baseball.ErrorMessage.NUMBER_SCOPE_ONE_NINE
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.throwable.shouldHaveMessage
import io.kotest.matchers.types.shouldBeSameInstanceAs

internal class NumbersTest : BehaviorSpec ({
    given("presenceNumbers") {
        `when`("번호가 존재할 경우") {
            val result = Numbers.confirmNumber(2)
            then("번호 객체 리턴") {
                result shouldBeSameInstanceAs Numbers.confirmNumber(2)
            }
        }

        `when`("존재하지 않은 번호를 찾을 경우") {
            then("exception") {
                shouldThrow<IllegalArgumentException> {
                    Numbers.confirmNumber(10)
                }.shouldHaveMessage(NUMBER_SCOPE_ONE_NINE)
            }
        }
    }
})