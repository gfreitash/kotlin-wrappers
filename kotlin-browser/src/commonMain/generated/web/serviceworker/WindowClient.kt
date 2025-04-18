// Automatically generated - do not modify!

package web.serviceworker

import js.promise.Promise
import seskar.js.JsAsync
import web.dom.DocumentVisibilityState
import web.url.URL
import kotlin.js.JsName

/**
 * This ServiceWorker API interface represents the scope of a service worker client that is a document in a browser context, controlled by an active worker. The service worker client independently selects and uses a service worker for its own loading and sub-resources.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WindowClient)
 */
external class WindowClient
private constructor() :
    Client {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WindowClient/focused)
     */
    val focused: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WindowClient/visibilityState)
     */
    val visibilityState: DocumentVisibilityState

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WindowClient/focus)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun focus(): WindowClient

    @JsName("focus")
    fun focusAsync(): Promise<WindowClient>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/WindowClient/navigate)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun navigate(url: String): WindowClient?

    @JsName("navigate")
    fun navigateAsync(url: String): Promise<WindowClient?>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun navigate(url: URL): WindowClient?

    @JsName("navigate")
    fun navigateAsync(url: URL): Promise<WindowClient?>
}
