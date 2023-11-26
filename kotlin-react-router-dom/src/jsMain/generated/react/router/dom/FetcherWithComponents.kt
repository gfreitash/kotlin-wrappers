// Generated by Karakum - do not modify it manually!


package react.router.dom

import react.ForwardRefExoticComponent
import remix.run.router.Fetcher


sealed external interface FetcherWithComponents<TData> : Fetcher<TData> {
    var Form: ForwardRefExoticComponent<FetcherFormProps>
    var submit: FetcherSubmitFunction
    var load: (href: String, opts: (FetcherWithComponentsLoadOpts)? /* use undefined for default */) -> Unit
}
