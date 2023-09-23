package node.crypto


sealed external interface RSAPSSKeyPairOptions<PubF : KeyFormat, PrivF : KeyFormat> {
    /**
     * Key size in bits
     */
    var modulusLength: Double

    /**
     * Public exponent
     * @default 0x10001
     */
    var publicExponent: Double?

    /**
     * Name of the message digest
     */
    var hashAlgorithm: String?

    /**
     * Name of the message digest used by MGF1
     */
    var mgf1HashAlgorithm: String?

    /**
     * Minimal salt length in bytes
     */
    var saltLength: String?
    var publicKeyEncoding: RSAPSSKeyPairOptionsPublicKeyEncoding<PubF>
    var privateKeyEncoding: RSAPSSKeyPairOptionsPrivateKeyEncoding<PrivF>
}
