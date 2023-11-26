// Generated by Karakum - do not modify it manually!


package electron.core

import web.messaging.MessagePort
import kotlin.js.Promise


@Suppress("INTERFACE_WITH_SUPERCLASS")

external interface IpcRenderer : node.events.EventEmitter {
// Docs: https://electronjs.org/docs/api/ipc-renderer
    /**
     * Resolves with the response from the main process.
     *
     * Send a message to the main process via `channel` and expect a result
     * asynchronously. Arguments will be serialized with the Structured Clone
     * Algorithm, just like `window.postMessage`, so prototype chains will not be
     * included. Sending Functions, Promises, Symbols, WeakMaps, or WeakSets will throw
     * an exception.
     *
     * The main process should listen for `channel` with `ipcMain.handle()`.
     *
     * For example:
     *
     * If you need to transfer a `MessagePort` to the main process, use
     * `ipcRenderer.postMessage`.
     *
     * If you do not need a response to the message, consider using `ipcRenderer.send`.
     *
     * > **Note** Sending non-standard JavaScript types such as DOM objects or special
     * Electron objects will throw an exception.
     *
     * Since the main process does not have support for DOM objects such as
     * `ImageBitmap`, `File`, `DOMMatrix` and so on, such objects cannot be sent over
     * Electron's IPC to the main process, as the main process would have no way to
     * decode them. Attempting to send such objects over IPC will result in an error.
     *
     * > **Note** If the handler in the main process throws an error, the promise
     * returned by `invoke` will reject. However, the `Error` object in the renderer
     * process will not be the same as the one thrown in the main process.
     */
    fun invoke(channel: String, vararg args: Any? /* js.core.ReadonlyArray<Any?> */): Promise<Any?>

    /**
     * Listens to `channel`, when a new message arrives `listener` would be called with
     * `listener(event, args...)`.
     */
    fun on(
        channel: String,
        listener: Function<Unit>, /* (event: IpcRendererEvent, ...args: any[]) => void */
    ): Unit /* this */

    /**
     * Adds a one time `listener` function for the event. This `listener` is invoked
     * only the next time a message is sent to `channel`, after which it is removed.
     */
    fun once(
        channel: String,
        listener: Function<Unit>, /* (event: IpcRendererEvent, ...args: any[]) => void */
    ): Unit /* this */

    /**
     * Send a message to the main process, optionally transferring ownership of zero or
     * more `MessagePort` objects.
     *
     * The transferred `MessagePort` objects will be available in the main process as
     * `MessagePortMain` objects by accessing the `ports` property of the emitted
     * event.
     *
     * For example:
     *
     * For more information on using `MessagePort` and `MessageChannel`, see the MDN
     * documentation.
     */
    fun postMessage(
        channel: String,
        message: Any?,
        transfer: js.core.ReadonlyArray<MessagePort> = definedExternally,
    ): Unit

    /**
     * Removes all listeners, or those of the specified `channel`.
     */
    fun removeAllListeners(channel: String): Unit /* this */

    /**
     * Removes the specified `listener` from the listener array for the specified
     * `channel`.
     */
    fun removeListener(channel: String, listener: Function<Unit> /* (...args: any[]) => void */): Unit /* this */

    /**
     * Send an asynchronous message to the main process via `channel`, along with
     * arguments. Arguments will be serialized with the Structured Clone Algorithm,
     * just like `window.postMessage`, so prototype chains will not be included.
     * Sending Functions, Promises, Symbols, WeakMaps, or WeakSets will throw an
     * exception.
     *
     * > **NOTE:** Sending non-standard JavaScript types such as DOM objects or special
     * Electron objects will throw an exception.
     *
     * Since the main process does not have support for DOM objects such as
     * `ImageBitmap`, `File`, `DOMMatrix` and so on, such objects cannot be sent over
     * Electron's IPC to the main process, as the main process would have no way to
     * decode them. Attempting to send such objects over IPC will result in an error.
     *
     * The main process handles it by listening for `channel` with the `ipcMain`
     * module.
     *
     * If you need to transfer a `MessagePort` to the main process, use
     * `ipcRenderer.postMessage`.
     *
     * If you want to receive a single response from the main process, like the result
     * of a method call, consider using `ipcRenderer.invoke`.
     */
    fun send(channel: String, vararg args: Any? /* js.core.ReadonlyArray<Any?> */): Unit

    /**
     * The value sent back by the `ipcMain` handler.
     *
     * Send a message to the main process via `channel` and expect a result
     * synchronously. Arguments will be serialized with the Structured Clone Algorithm,
     * just like `window.postMessage`, so prototype chains will not be included.
     * Sending Functions, Promises, Symbols, WeakMaps, or WeakSets will throw an
     * exception.
     *
     * > **NOTE:** Sending non-standard JavaScript types such as DOM objects or special
     * Electron objects will throw an exception.
     *
     * Since the main process does not have support for DOM objects such as
     * `ImageBitmap`, `File`, `DOMMatrix` and so on, such objects cannot be sent over
     * Electron's IPC to the main process, as the main process would have no way to
     * decode them. Attempting to send such objects over IPC will result in an error.
     *
     * The main process handles it by listening for `channel` with `ipcMain` module,
     * and replies by setting `event.returnValue`.
     *
     * > :warning: **WARNING**: Sending a synchronous message will block the whole
     * renderer process until the reply is received, so use this method only as a last
     * resort. It's much better to use the asynchronous version, `invoke()`.
     */
    fun sendSync(channel: String, vararg args: Any? /* js.core.ReadonlyArray<Any?> */): Any?

    /**
     * Sends a message to a window with `webContentsId` via `channel`.
     */
    fun sendTo(webContentsId: Double, channel: String, vararg args: Any? /* js.core.ReadonlyArray<Any?> */): Unit

    /**
     * Like `ipcRenderer.send` but the event will be sent to the `<webview>` element in
     * the host page instead of the main process.
     */
    fun sendToHost(channel: String, vararg args: Any? /* js.core.ReadonlyArray<Any?> */): Unit
}
