// Automatically generated - do not modify!

package web.audio

import web.errors.ErrorEvent
import web.events.EventHandler
import web.events.EventInstance
import web.events.JsEvent
import web.messaging.MessagePort
import kotlin.js.definedExternally

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode)
 */
open external class AudioWorkletNode(
    context: BaseAudioContext,
    name: String,
    options: AudioWorkletNodeOptions = definedExternally,
) : AudioNode {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode/processorerror_event)
     */
    var onprocessorerror: EventHandler<ErrorEvent, AudioWorkletNode, AudioWorkletNode>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode/parameters)
     */
    val parameters: AudioParamMap

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode/port)
     */
    val port: MessagePort

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletNode/processorerror_event)
     */
    @JsEvent("processorerror")
    val processorErrorEvent: EventInstance<ErrorEvent, AudioWorkletNode /* this */, AudioWorkletNode /* this */>
}
