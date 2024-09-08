// Generated by Karakum - do not modify it manually!

@file:JsModule("node:vm")
@file:JsQualifier("constants")

package node.vm.constants

/**
 * Stability: 1.1 - Active development
 *
 * A constant that can be used as the `importModuleDynamically` option to `vm.Script`
 * and `vm.compileFunction()` so that Node.js uses the default ESM loader from the main
 * context to load the requested module.
 *
 * For detailed information, see [Support of dynamic `import()` in compilation APIs](https://nodejs.org/docs/latest-v22.x/api/vm.html#support-of-dynamic-import-in-compilation-apis).
 */
external val USE_MAIN_CONTEXT_DEFAULT_LOADER: Double
