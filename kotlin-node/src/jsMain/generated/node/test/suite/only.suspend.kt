// Generated by Karakum - do not modify it manually!

package node.test.suite

import node.test.SuiteFn
import node.test.TestOptions


@seskar.js.JsAsync
external suspend fun only(): js.core.Void


@seskar.js.JsAsync
external suspend fun only(
    name: String = definedExternally,
    options: TestOptions = definedExternally,
    fn: SuiteFn = definedExternally,
): js.core.Void


@seskar.js.JsAsync
external suspend fun only(name: String = definedExternally, fn: SuiteFn = definedExternally): js.core.Void


@seskar.js.JsAsync
external suspend fun only(options: TestOptions = definedExternally, fn: SuiteFn = definedExternally): js.core.Void


@seskar.js.JsAsync
external suspend fun only(fn: SuiteFn = definedExternally): js.core.Void
