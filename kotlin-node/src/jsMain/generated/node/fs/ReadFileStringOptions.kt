// Generated by Karakum - do not modify it manually!

package node.fs

import web.abort.Abortable


@kotlinx.js.JsPlainObject
sealed external interface ReadFileStringOptions : Abortable {
    var encoding: node.buffer.BufferEncoding
    var flag: String?
}
