// Generated by Karakum - do not modify it manually!

package node.module

import web.url.URL

sealed external interface ImportMeta {
    /**
     * The directory name of the current module. This is the same as the `path.dirname()` of the `import.meta.filename`.
     * **Caveat:** only present on `file:` modules.
     */
    var dirname: String

    /**
     * The full absolute path and filename of the current module, with symlinks resolved.
     * This is the same as the `url.fileURLToPath()` of the `import.meta.url`.
     * **Caveat:** only local modules support this property. Modules not using the `file:` protocol will not provide it.
     */
    var filename: String

    /**
     * The absolute `file:` URL of the module.
     */
    var url: String

    /**
     * Provides a module-relative resolution function scoped to each module, returning
     * the URL string.
     *
     * Second `parent` parameter is only used when the `--experimental-import-meta-resolve`
     * command flag enabled.
     *
     * @since v20.6.0
     *
     * @param specifier The module specifier to resolve relative to `parent`.
     * @param parent The absolute parent module URL to resolve from.
     * @returns The absolute (`file:`) URL string for the resolved module.
     */
    fun resolve(specifier: String): String

    /**
     * Provides a module-relative resolution function scoped to each module, returning
     * the URL string.
     *
     * Second `parent` parameter is only used when the `--experimental-import-meta-resolve`
     * command flag enabled.
     *
     * @since v20.6.0
     *
     * @param specifier The module specifier to resolve relative to `parent`.
     * @param parent The absolute parent module URL to resolve from.
     * @returns The absolute (`file:`) URL string for the resolved module.
     */
    fun resolve(specifier: String, parent: String? = definedExternally): String

    /**
     * Provides a module-relative resolution function scoped to each module, returning
     * the URL string.
     *
     * Second `parent` parameter is only used when the `--experimental-import-meta-resolve`
     * command flag enabled.
     *
     * @since v20.6.0
     *
     * @param specifier The module specifier to resolve relative to `parent`.
     * @param parent The absolute parent module URL to resolve from.
     * @returns The absolute (`file:`) URL string for the resolved module.
     */
    fun resolve(specifier: String, parent: URL? = definedExternally): String
}
