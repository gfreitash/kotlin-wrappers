package react.router

import remix.run.router.To

/**
 * The interface for the navigate() function returned from useNavigate().
 */

sealed class NavigateFunction {
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun invoke(to: To) {
        asDynamic()(to)
    }

    @Suppress("NOTHING_TO_INLINE")
    inline operator fun invoke(to: To, options: NavigateOptions) {
        asDynamic()(to, options)
    }

    @Suppress("NOTHING_TO_INLINE")
    inline operator fun invoke(delta: Int) {
        asDynamic()(delta)
    }
}
