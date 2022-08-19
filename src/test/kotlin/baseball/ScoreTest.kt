package baseball

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class ScoreTest : BehaviorSpec ({
    given("점수 계산") {
        val score = Score()
        `when`("3스트라이크") {
            val result = score.calculateScore(
                makeNumbers(1,2,3),
                makeNumbers(1,2,3)
            )
            then("검증") {
                result.first shouldBe 3
                result.second shouldBe 0
            }
        }
        `when`("3볼") {
            val result = score.calculateScore(
                makeNumbers(1,2,3),
                makeNumbers(3,1,2)
            )
            then("검증") {
                result.first shouldBe 0
                result.second shouldBe 3
            }
        }
        `when`("1스트라이크 1볼") {
            val result = score.calculateScore(
                makeNumbers(3,2,3),
                makeNumbers(3,5,2)
            )
            then("검증") {
                result.first shouldBe 1
                result.second shouldBe 1
            }
        }
        `when`("낫싱") {
            val result = score.calculateScore(
                makeNumbers(1,2,3),
                makeNumbers(4,5,6)
            )
            then("검증") {
                result.first shouldBe 0
                result.second shouldBe 0
            }
        }
    }
})

private fun makeNumbers(first: Int, second: Int, three: Int) = mutableListOf(
    Numbers.confirmNumber(first),
    Numbers.confirmNumber(second),
    Numbers.confirmNumber(three)
)