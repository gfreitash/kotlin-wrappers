// Generated by Karakum - do not modify it manually!

package node.repl

sealed external interface ReplOptions {
    /**
     * The input prompt to display.
     * @default "> "
     */
    var prompt: String?

    /**
     * The `Readable` stream from which REPL input will be read.
     * @default process.stdin
     */
    var input: node.ReadableStream?

    /**
     * The `Writable` stream to which REPL output will be written.
     * @default process.stdout
     */
    var output: node.WritableStream?

    /**
     * If `true`, specifies that the output should be treated as a TTY terminal, and have
     * ANSI/VT100 escape codes written to it.
     * Default: checking the value of the `isTTY` property on the output stream upon
     * instantiation.
     */
    var terminal: Boolean?

    /**
     * The function to be used when evaluating each given line of input.
     * Default: an async wrapper for the JavaScript `eval()` function. An `eval` function can
     * error with `repl.Recoverable` to indicate the input was incomplete and prompt for
     * additional lines.
     *
     * @see https://nodejs.org/dist/latest-v22.x/docs/api/repl.html#repl_default_evaluation
     * @see https://nodejs.org/dist/latest-v22.x/docs/api/repl.html#repl_custom_evaluation_functions
     */
    var eval: REPLEval?

    /**
     * Defines if the repl prints output previews or not.
     * @default `true` Always `false` in case `terminal` is falsy.
     */
    var preview: Boolean?

    /**
     * If `true`, specifies that the default `writer` function should include ANSI color
     * styling to REPL output. If a custom `writer` function is provided then this has no
     * effect.
     * @default the REPL instance's `terminal` value
     */
    var useColors: Boolean?

    /**
     * If `true`, specifies that the default evaluation function will use the JavaScript
     * `global` as the context as opposed to creating a new separate context for the REPL
     * instance. The node CLI REPL sets this value to `true`.
     * @default false
     */
    var useGlobal: Boolean?

    /**
     * If `true`, specifies that the default writer will not output the return value of a
     * command if it evaluates to `undefined`.
     * @default false
     */
    var ignoreUndefined: Boolean?

    /**
     * The function to invoke to format the output of each command before writing to `output`.
     * @default a wrapper for `util.inspect`
     *
     * @see https://nodejs.org/dist/latest-v22.x/docs/api/repl.html#repl_customizing_repl_output
     */
    var writer: REPLWriter?

    /**
     * An optional function used for custom Tab auto completion.
     *
     * @see https://nodejs.org/dist/latest-v22.x/docs/api/readline.html#readline_use_of_the_completer_function
     */
    var completer: Any? /* Completer | AsyncCompleter | undefined */

    /**
     * A flag that specifies whether the default evaluator executes all JavaScript commands in
     * strict mode or default (sloppy) mode.
     * Accepted values are:
     * - `repl.REPL_MODE_SLOPPY` - evaluates expressions in sloppy mode.
     * - `repl.REPL_MODE_STRICT` - evaluates expressions in strict mode. This is equivalent to
     *   prefacing every repl statement with `'use strict'`.
     */
    var replMode: Any? /* typeof REPL_MODE_SLOPPY | typeof REPL_MODE_STRICT | undefined */

    /**
     * Stop evaluating the current piece of code when `SIGINT` is received, i.e. `Ctrl+C` is
     * pressed. This cannot be used together with a custom `eval` function.
     * @default false
     */
    var breakEvalOnSigint: Boolean?
}
