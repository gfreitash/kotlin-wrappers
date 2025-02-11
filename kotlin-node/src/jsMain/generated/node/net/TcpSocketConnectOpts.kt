// Generated by Karakum - do not modify it manually!

package node.net

external interface TcpSocketConnectOpts {
    var port: Double
    var host: String?
    var localAddress: String?
    var localPort: Double?
    var hints: Double?
    var family: Double?
    var lookup: LookupFunction?
    var noDelay: Boolean?
    var keepAlive: Boolean?
    var keepAliveInitialDelay: Double?

    /**
     * @since v18.13.0
     */
    var autoSelectFamily: Boolean?

    /**
     * @since v18.13.0
     */
    var autoSelectFamilyAttemptTimeout: Double?
    var blockList: BlockList?
}
