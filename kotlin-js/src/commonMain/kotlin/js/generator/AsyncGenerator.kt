package js.generator

import js.core.JsAny
import js.errors.JsError
import js.iterable.AsyncIterator
import js.iterable.IteratorResult
import js.promise.Promise
import js.promise.PromiseLike
import seskar.js.JsSpecialName
import kotlin.js.definedExternally as definedExternally_

private const val ASYNC_GENERATOR: String = "(async function* () {}.constructor.prototype.prototype)"

@JsSpecialName(ASYNC_GENERATOR)
external class AsyncGenerator<out T : JsAny?, TReturn : JsAny?, in TNext : JsAny?>
private constructor() :
    AsyncIterator<T> {
    override fun next(): Promise<IteratorResult<T, TReturn>>
    fun next(value: TNext = definedExternally_): Promise<IteratorResult<T, TReturn>>

    fun `return`(value: TReturn): Promise<IteratorResult<T, TReturn>>

    fun `return`(value: PromiseLike<TReturn>): Promise<IteratorResult<T, TReturn>>

    fun `throw`(error: JsError): Promise<IteratorResult<T, TReturn>>
}
