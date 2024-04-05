// Generated by Karakum - do not modify it manually!

package node.fs

import js.promise.await


suspend fun readdir(
    path: PathLike,
    options: (ReaddirAsyncOptions)? = undefined.unsafeCast<Nothing>(),
): js.array.ReadonlyArray<String> =
    readdirAsync(
        path, options
    ).await()


suspend fun readdir(
    path: PathLike,
    options: node.buffer.BufferEncoding? = undefined.unsafeCast<Nothing>(),
): js.array.ReadonlyArray<String> =
    readdirAsync(
        path, options
    ).await()


suspend fun readdir(path: PathLike, options: ReaddirBufferAsyncOptions): js.array.ReadonlyArray<node.buffer.Buffer> =
    readdirAsync(
        path, options
    ).await()


suspend fun readdir(path: PathLike, options: String /* "buffer" */): js.array.ReadonlyArray<node.buffer.Buffer> =
    readdirAsync(
        path, options
    ).await()


suspend fun readdir(path: PathLike, options: ReaddirWithFileTypesAsyncOptions): js.array.ReadonlyArray<Dirent> =
    readdirAsync(
        path, options
    ).await()


suspend fun readdir(path: PathLike): js.array.ReadonlyArray<String> =
    readdirAsync(
        path
    ).await()
