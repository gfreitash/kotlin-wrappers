package benchmark

import TestScope
import addCss
import measureTimeJSSync
import react.Props
import react.fc
import styled.styledDiv
import kotlin.random.Random
import kotlin.test.Test
import kotlin.time.Duration

class AddDuplicateCss : BenchmarkBase() {
    /**
     * Measure the time elapsed to inject [repeatCount] styled components with the same CSS [n] times into the DOM
     * @return duration of all injects
     */
    private suspend fun TestScope.addElement(n: Int, repeatCount: Int): Duration {
        val component = fc<Props> {
            (1..repeatCount).forEach {
                val random = Random(152)
                (1..n).forEach {
                    styledDiv {
                        addCss(it, random)
                    }
                }
            }
        }
        val duration = measureTimeJSSync {
            getRootInfo().renderComponent(component)
        }

        assertChildrenCount(n * repeatCount)
        assertCssNotEmpty()

        clear()
        return duration
    }

    @Test
    fun add20DuplicatedElements() = runBenchmark("add20DuplicatedElements") {
        addElement(20, 15)
    }

    @Test
    fun add50DuplicatedElements() = runBenchmark("add50DuplicatedElements") {
        addElement(50, 5)
    }

    @Test
    fun add100DuplicatedElements() = runBenchmark("add100DuplicatedElements") {
        addElement(100, 20)
    }
}
