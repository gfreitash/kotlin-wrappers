// Generated by Karakum - do not modify it manually!

@file:JsModule("node:stream/consumers")

package node.stream.consumers

import js.iterable.AsyncIterable
import js.promise.Promise
import node.stream.Readable


@JsName("json")
external fun jsonAsync(stream: node.ReadableStream): Promise<Any?>


@JsName("json")
external fun jsonAsync(stream: Readable): Promise<Any?>


@JsName("json")
external fun jsonAsync(stream: AsyncIterable<Any?>): Promise<Any?>
