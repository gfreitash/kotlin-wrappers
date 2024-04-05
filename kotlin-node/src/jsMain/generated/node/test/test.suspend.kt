// Generated by Karakum - do not modify it manually!

package node.test

import js.promise.await


suspend fun test(name: String = undefined.unsafeCast<Nothing>(), fn: TestFn = undefined.unsafeCast<Nothing>()): Unit =
    testAsync(
        name, fn
    ).await()


suspend fun test(
    name: String = undefined.unsafeCast<Nothing>(),
    options: TestOptions = undefined.unsafeCast<Nothing>(),
    fn: TestFn = undefined.unsafeCast<Nothing>(),
): Unit =
    testAsync(
        name, options, fn
    ).await()


suspend fun test(
    options: TestOptions = undefined.unsafeCast<Nothing>(),
    fn: TestFn = undefined.unsafeCast<Nothing>(),
): Unit =
    testAsync(
        options, fn
    ).await()


suspend fun test(fn: TestFn = undefined.unsafeCast<Nothing>()): Unit =
    testAsync(
        fn
    ).await()


suspend fun test(): Unit =
    testAsync(

    ).await()
