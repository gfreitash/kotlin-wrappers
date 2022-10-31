package web.workers

import kotlinx.js.ReadonlyArray
import web.events.EventTarget
import web.messaging.StructuredSerializeOptions
import web.messaging.Transferable
import web.url.URL

open external class Worker : EventTarget, AbstractWorker {
    constructor(
        scriptURL: String,
        options: WorkerOptions = definedExternally,
    )

    constructor(
        scriptURL: URL,
        options: WorkerOptions = definedExternally,
    )

    /** Clones message and transmits it to worker's global environment. transfer can be passed as a list of objects that are to be transferred rather than cloned. */
    fun postMessage(
        message: Any?,
        transfer: ReadonlyArray<Transferable>,
    )

    fun postMessage(
        message: Any?,
        options: StructuredSerializeOptions = definedExternally,
    )

    /** Aborts worker's associated global environment. */
    fun terminate()
}
