// Generated by Karakum - do not modify it manually!

@file:JsModule("node:module")

package node.module

import web.url.URL

/* eslint-disable @definitelytyped/no-unnecessary-generics */
/**
 * Register a module that exports hooks that customize Node.js module
 * resolution and loading behavior. See
 * [Customization hooks](https://nodejs.org/docs/latest-v22.x/api/module.html#customization-hooks).
 * @since v20.6.0, v18.19.0
 * @param specifier Customization hooks to be registered; this should be
 * the same string that would be passed to `import()`, except that if it is
 * relative, it is resolved relative to `parentURL`.
 * @param parentURL f you want to resolve `specifier` relative to a base
 * URL, such as `import.meta.url`, you can pass that URL here.
 */
external fun <Data /* default is Any? */> register(specifier: String): Unit

/* eslint-disable @definitelytyped/no-unnecessary-generics */
/**
 * Register a module that exports hooks that customize Node.js module
 * resolution and loading behavior. See
 * [Customization hooks](https://nodejs.org/docs/latest-v22.x/api/module.html#customization-hooks).
 * @since v20.6.0, v18.19.0
 * @param specifier Customization hooks to be registered; this should be
 * the same string that would be passed to `import()`, except that if it is
 * relative, it is resolved relative to `parentURL`.
 * @param parentURL f you want to resolve `specifier` relative to a base
 * URL, such as `import.meta.url`, you can pass that URL here.
 */
external fun <Data /* default is Any? */> register(
    specifier: String,
    parentURL: String = definedExternally,
    options: RegisterOptions<Data> = definedExternally,
): Unit

/* eslint-disable @definitelytyped/no-unnecessary-generics */
/**
 * Register a module that exports hooks that customize Node.js module
 * resolution and loading behavior. See
 * [Customization hooks](https://nodejs.org/docs/latest-v22.x/api/module.html#customization-hooks).
 * @since v20.6.0, v18.19.0
 * @param specifier Customization hooks to be registered; this should be
 * the same string that would be passed to `import()`, except that if it is
 * relative, it is resolved relative to `parentURL`.
 * @param parentURL f you want to resolve `specifier` relative to a base
 * URL, such as `import.meta.url`, you can pass that URL here.
 */
external fun <Data /* default is Any? */> register(
    specifier: String,
    parentURL: URL = definedExternally,
    options: RegisterOptions<Data> = definedExternally,
): Unit

/* eslint-disable @definitelytyped/no-unnecessary-generics */
/**
 * Register a module that exports hooks that customize Node.js module
 * resolution and loading behavior. See
 * [Customization hooks](https://nodejs.org/docs/latest-v22.x/api/module.html#customization-hooks).
 * @since v20.6.0, v18.19.0
 * @param specifier Customization hooks to be registered; this should be
 * the same string that would be passed to `import()`, except that if it is
 * relative, it is resolved relative to `parentURL`.
 * @param parentURL f you want to resolve `specifier` relative to a base
 * URL, such as `import.meta.url`, you can pass that URL here.
 */
external fun <Data /* default is Any? */> register(specifier: URL): Unit

/* eslint-disable @definitelytyped/no-unnecessary-generics */
/**
 * Register a module that exports hooks that customize Node.js module
 * resolution and loading behavior. See
 * [Customization hooks](https://nodejs.org/docs/latest-v22.x/api/module.html#customization-hooks).
 * @since v20.6.0, v18.19.0
 * @param specifier Customization hooks to be registered; this should be
 * the same string that would be passed to `import()`, except that if it is
 * relative, it is resolved relative to `parentURL`.
 * @param parentURL f you want to resolve `specifier` relative to a base
 * URL, such as `import.meta.url`, you can pass that URL here.
 */
external fun <Data /* default is Any? */> register(
    specifier: URL,
    parentURL: String = definedExternally,
    options: RegisterOptions<Data> = definedExternally,
): Unit

/* eslint-disable @definitelytyped/no-unnecessary-generics */
/**
 * Register a module that exports hooks that customize Node.js module
 * resolution and loading behavior. See
 * [Customization hooks](https://nodejs.org/docs/latest-v22.x/api/module.html#customization-hooks).
 * @since v20.6.0, v18.19.0
 * @param specifier Customization hooks to be registered; this should be
 * the same string that would be passed to `import()`, except that if it is
 * relative, it is resolved relative to `parentURL`.
 * @param parentURL f you want to resolve `specifier` relative to a base
 * URL, such as `import.meta.url`, you can pass that URL here.
 */
external fun <Data /* default is Any? */> register(
    specifier: URL,
    parentURL: URL = definedExternally,
    options: RegisterOptions<Data> = definedExternally,
): Unit

external fun <Data /* default is Any? */> register(
    specifier: String,
    options: RegisterOptions<Data> = definedExternally,
): Unit

external fun <Data /* default is Any? */> register(
    specifier: URL,
    options: RegisterOptions<Data> = definedExternally,
): Unit
