// Generated by Karakum - do not modify it manually!

package node.vm

sealed external interface RunningCodeInNewContextOptions : RunningScriptInNewContextOptions {
    var cachedData: Any? /* Buffer<ArrayBufferLike> | ArrayBufferView<ArrayBufferLike> | undefined */
    var importModuleDynamically: Any? /* number | ((specifier: string, script: Script, importAttributes: ImportAttributes) => Module | Promise<Module>) | undefined */
}
