// Generated by Karakum - do not modify it manually!

package remix.run.router

sealed external interface DataStrategyFunctionArgs<Context /* default is Any? */> : DataFunctionArgs<Context> {
    var matches: js.array.ReadonlyArray<DataStrategyMatch>
    var fetcherKey: String?
}
