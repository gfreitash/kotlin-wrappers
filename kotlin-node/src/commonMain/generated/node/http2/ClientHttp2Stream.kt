// Generated by Karakum - do not modify it manually!

package node.http2

sealed external interface ClientHttp2Stream : Http2Stream {


    override fun addListener(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    override fun addListener(
        event: js.symbol.Symbol,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */


    override fun emit(event: String, vararg args: Any?): Boolean

    override fun emit(event: js.symbol.Symbol, vararg args: Any?): Boolean


    override fun on(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    override fun on(event: js.symbol.Symbol, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */


    override fun once(event: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    override fun once(event: js.symbol.Symbol, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */


    override fun prependListener(
        event: String,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    override fun prependListener(
        event: js.symbol.Symbol,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */


    override fun prependOnceListener(
        event: String,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    override fun prependOnceListener(
        event: js.symbol.Symbol,
        listener: Function<Unit>, /* (...args: any[]) => void */
    ): Unit /* this */

    @web.events.JsEvent("continue")
    val continueEvent: node.events.EventInstance<js.array.JsTuple>

    @web.events.JsEvent("headers")
    val headersEvent: node.events.EventInstance<js.array.JsTuple2<ClientHttp2StreamAddListenerListenerHeaders, Double>>

    @web.events.JsEvent("push")
    val pushEvent: node.events.EventInstance<js.array.JsTuple2<IncomingHttpHeaders, Double>>

    @web.events.JsEvent("response")
    val responseEvent: node.events.EventInstance<js.array.JsTuple2<ClientHttp2StreamAddListenerListenerHeaders, Double>>
}
