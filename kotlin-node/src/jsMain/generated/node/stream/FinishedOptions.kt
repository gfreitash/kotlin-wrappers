// Generated by Karakum - do not modify it manually!


package node.stream

import web.abort.Abortable


@kotlinx.js.JsPlainObject
sealed external interface FinishedOptions : Abortable {
    var error: Boolean?
    var readable: Boolean?
    var writable: Boolean?
}
