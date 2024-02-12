// Automatically generated - do not modify!

package web.csp

import web.events.EventInit

external interface SecurityPolicyViolationEventInit :
    EventInit {
    val blockedURI: String?
    val columnNumber: Int?
    val disposition: SecurityPolicyViolationEventDisposition
    val documentURI: String
    val effectiveDirective: String
    val lineNumber: Int?
    val originalPolicy: String
    val referrer: String?
    val sample: String?
    val sourceFile: String?
    val statusCode: Short
    val violatedDirective: String
}
