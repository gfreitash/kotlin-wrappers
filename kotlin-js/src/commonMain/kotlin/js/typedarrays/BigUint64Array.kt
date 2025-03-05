package js.typedarrays

import js.array.ReadonlyArray
import js.buffer.ArrayBuffer
import js.buffer.ArrayBufferLike
import js.core.BigInt
import js.iterable.JsIterable
import kotlin.js.definedExternally as definedExternally_

open external class BigUint64Array<B : ArrayBufferLike>(
    override val buffer: B,
    override val byteOffset: Int = definedExternally_,
    override val length: Int = definedExternally_,
) : TypedArray<BigUint64Array<B>, BigUint64Array<ArrayBuffer>, B, BigInt> {
    constructor()
    constructor(length: Int)
    constructor(elements: JsIterable<BigInt>)
    constructor(elements: ReadonlyArray<BigInt>)

    companion object : TypedArrayCompanion<BigUint64Array<ArrayBuffer>, BigInt>
}
