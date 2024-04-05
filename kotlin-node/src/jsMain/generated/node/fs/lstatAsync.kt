// Generated by Karakum - do not modify it manually!

@file:JsModule("node:fs/promises")

package node.fs

import js.promise.Promise

/**
 * Equivalent to `fsPromises.stat()` unless `path` refers to a symbolic link,
 * in which case the link itself is stat-ed, not the file that it refers to.
 * Refer to the POSIX [`lstat(2)`](http://man7.org/linux/man-pages/man2/lstat.2.html) document for more detail.
 * @since v10.0.0
 * @return Fulfills with the {fs.Stats} object for the given symbolic link `path`.
 */

@JsName("lstat")
external fun lstatAsync(path: PathLike, opts: LstatOpts = definedExternally): Promise<Stats>


@JsName("lstat")
external fun lstatAsync(path: PathLike, opts: LstatBigIntOpts): Promise<BigIntStats>


@JsName("lstat")
external fun lstatAsync(path: PathLike, opts: StatOptions = definedExternally): Promise<Any /* Stats | BigIntStats */>

@JsName("lstat")
external fun lstatAsync(path: PathLike): Promise<Stats>
