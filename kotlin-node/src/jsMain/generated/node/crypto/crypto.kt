// Generated by Karakum - do not modify it manually!

@file:JsModule("node:crypto")

package node.crypto

/**
 * The `node:crypto` module provides cryptographic functionality that includes a
 * set of wrappers for OpenSSL's hash, HMAC, cipher, decipher, sign, and verify
 * functions.
 *
 * ```js
 * const { createHmac } = await import('node:crypto');
 *
 * const secret = 'abcdefg';
 * const hash = createHmac('sha256', secret)
 *                .update('I love cupcakes')
 *                .digest('hex');
 * console.log(hash);
 * // Prints:
 * //   c0fa1bc00531bd78ef38c628449c5102aeabd49b5dc3a2a516ea6ea959d6658e
 * ```
 * @see [source](https://github.com/nodejs/node/blob/v22.x/lib/crypto.js)
 */


/* export * from "crypto"; */
