package web.abort.internal

import js.objects.Object
import js.objects.jso
import js.promise.PromiseLike
import kotlinx.coroutines.suspendCancellableCoroutine
import web.abort.AbortController
import web.abort.Abortable

internal fun <T : Abortable> patchAbortOptions(
    options: T?,
    controller: AbortController,
): T {
    val abortOptions = Abortable(
        signal = safeAny(options?.signal, controller.signal)
    )

    return Object.assign(jso(), options, abortOptions)
}

internal suspend fun <T> awaitPromiseLike(
    promise: PromiseLike<T>,
    controller: AbortController,
): T =
    suspendCancellableCoroutine { continuation ->
        continuation.invokeOnCancellation {
            controller.abort()
        }

        promise.thenTo(continuation)
    }
