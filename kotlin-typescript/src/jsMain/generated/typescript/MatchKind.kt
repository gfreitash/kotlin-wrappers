// Automatically generated - do not modify!

package typescript

import seskar.js.JsValue

sealed external interface MatchKind {
    companion object {
        @JsValue("exact")
        val exact: MatchKind

        @JsValue("prefix")
        val prefix: MatchKind

        @JsValue("substring")
        val substring: MatchKind

        @JsValue("camelCase")
        val camelCase: MatchKind
    }
}
