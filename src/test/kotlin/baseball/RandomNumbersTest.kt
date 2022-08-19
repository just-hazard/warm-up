package baseball

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.collections.shouldHaveSize
import org.junit.jupiter.api.Assertions.*

internal class RandomNumbersTest : BehaviorSpec({
    given("컴퓨터 숫자") {
        `when`("번호 3자리 확인") {
            val result = RandomNumbers.createNumbers()
            then("검증") {
                result shouldHaveSize 3
            }
        }
    }
})