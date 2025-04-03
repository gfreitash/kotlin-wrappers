// Generated by Karakum - do not modify it manually!

@file:JsModule("node:sqlite")

package node.sqlite

import js.typedarrays.Uint8Array

/**
 * This class represents a single [connection](https://www.sqlite.org/c3ref/sqlite3.html) to a SQLite database. All APIs
 * exposed by this class execute synchronously.
 * @since v22.5.0
 */
external class DatabaseSync {
    /**
     * Constructs a new `DatabaseSync` instance.
     * @param location The location of the database.
     * A SQLite database can be stored in a file or completely [in memory](https://www.sqlite.org/inmemorydb.html).
     * To use a file-backed database, the location should be a file path.
     * To use an in-memory database, the location should be the special name `':memory:'`.
     * @param options Configuration options for the database connection.
     */
    constructor (location: String, options: DatabaseSyncOptions = definedExternally)

    /**
     * Closes the database connection. An exception is thrown if the database is not
     * open. This method is a wrapper around [`sqlite3_close_v2()`](https://www.sqlite.org/c3ref/close.html).
     * @since v22.5.0
     */
    fun close(): Unit

    /**
     * Loads a shared library into the database connection. This method is a wrapper
     * around [`sqlite3_load_extension()`](https://www.sqlite.org/c3ref/load_extension.html). It is required to enable the
     * `allowExtension` option when constructing the `DatabaseSync` instance.
     * @since v22.13.0
     * @param path The path to the shared library to load.
     */
    fun loadExtension(path: String): Unit

    /**
     * Enables or disables the `loadExtension` SQL function, and the `loadExtension()`
     * method. When `allowExtension` is `false` when constructing, you cannot enable
     * loading extensions for security reasons.
     * @since v22.13.0
     * @param allow Whether to allow loading extensions.
     */
    fun enableLoadExtension(allow: Boolean): Unit

    /**
     * This method allows one or more SQL statements to be executed without returning
     * any results. This method is useful when executing SQL statements read from a
     * file. This method is a wrapper around [`sqlite3_exec()`](https://www.sqlite.org/c3ref/exec.html).
     * @since v22.5.0
     * @param sql A SQL string to execute.
     */
    fun exec(sql: String): Unit

    /**
     * This method is used to create SQLite user-defined functions. This method is a
     * wrapper around [`sqlite3_create_function_v2()`](https://www.sqlite.org/c3ref/create_function.html).
     * @since v22.13.0
     * @param name The name of the SQLite function to create.
     * @param options Optional configuration settings for the function.
     * @param func The JavaScript function to call when the SQLite
     * function is invoked.
     */
    fun function(
        name: String,
        options: FunctionOptions,
        func: Function<SupportedValueType>, /* (...args: SupportedValueType[]) => SupportedValueType */
    ): Unit

    fun function(
        name: String,
        func: Function<SupportedValueType>, /* (...args: SupportedValueType[]) => SupportedValueType */
    ): Unit

    /**
     * Opens the database specified in the `location` argument of the `DatabaseSync`constructor. This method should only be used when the database is not opened via
     * the constructor. An exception is thrown if the database is already open.
     * @since v22.5.0
     */
    fun open(): Unit

    /**
     * Compiles a SQL statement into a [prepared statement](https://www.sqlite.org/c3ref/stmt.html). This method is a wrapper
     * around [`sqlite3_prepare_v2()`](https://www.sqlite.org/c3ref/prepare.html).
     * @since v22.5.0
     * @param sql A SQL string to compile to a prepared statement.
     * @return The prepared statement.
     */
    fun prepare(sql: String): StatementSync

    /**
     * Creates and attaches a session to the database. This method is a wrapper around
     * [`sqlite3session_create()`](https://www.sqlite.org/session/sqlite3session_create.html) and
     * [`sqlite3session_attach()`](https://www.sqlite.org/session/sqlite3session_attach.html).
     * @param options The configuration options for the session.
     * @returns A session handle.
     * @since v22.12.0
     */
    fun createSession(options: CreateSessionOptions = definedExternally): Session

    /**
     * An exception is thrown if the database is not
     * open. This method is a wrapper around
     * [`sqlite3changeset_apply()`](https://www.sqlite.org/session/sqlite3changeset_apply.html).
     *
     * ```js
     * const sourceDb = new DatabaseSync(':memory:');
     * const targetDb = new DatabaseSync(':memory:');
     *
     * sourceDb.exec('CREATE TABLE data(key INTEGER PRIMARY KEY, value TEXT)');
     * targetDb.exec('CREATE TABLE data(key INTEGER PRIMARY KEY, value TEXT)');
     *
     * const session = sourceDb.createSession();
     *
     * const insert = sourceDb.prepare('INSERT INTO data (key, value) VALUES (?, ?)');
     * insert.run(1, 'hello');
     * insert.run(2, 'world');
     *
     * const changeset = session.changeset();
     * targetDb.applyChangeset(changeset);
     * // Now that the changeset has been applied, targetDb contains the same data as sourceDb.
     * ```
     * @param changeset A binary changeset or patchset.
     * @param options The configuration options for how the changes will be applied.
     * @returns Whether the changeset was applied succesfully without being aborted.
     * @since v22.12.0
     */
    fun applyChangeset(changeset: Uint8Array<*>, options: ApplyChangesetOptions = definedExternally): Boolean
}
