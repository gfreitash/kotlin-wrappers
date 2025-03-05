package js.errors

import kotlin.js.definedExternally as definedExternally_

open external class SyntaxError(
    override val message: String? = definedExternally_,
    options: ErrorOptions? = definedExternally_,
) : JsError
