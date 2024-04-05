// Generated by Karakum - do not modify it manually!

@file:JsModule("node:test")
@file:JsQualifier("it")

package node.test.it

import js.promise.Promise
import node.test.TestFn
import node.test.TestOptions

/**
 * Shorthand for marking a test as `only`, same as `it([name], { only: true }[, fn])`.
 * @since v18.15.0
 */

@JsName("only")
external fun onlyAsync(
    name: String = definedExternally,
    options: TestOptions = definedExternally,
    fn: TestFn = definedExternally,
): Promise<Unit>


@JsName("only")
external fun onlyAsync(name: String = definedExternally, fn: TestFn = definedExternally): Promise<Unit>


@JsName("only")
external fun onlyAsync(options: TestOptions = definedExternally, fn: TestFn = definedExternally): Promise<Unit>


@JsName("only")
external fun onlyAsync(fn: TestFn = definedExternally): Promise<Unit>

@JsName("only")
external fun onlyAsync(): Promise<Unit>
