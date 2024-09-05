// Automatically generated - do not modify!

package web.rtc

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/gatheringstatechange_event)
 */
inline val <C : RTCIceTransport> C.gatheringStateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.gatheringStateChange())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/icecandidate_event)
 */
inline val <C : RTCIceTransport> C.iceCandidateEvent: EventInstance<RTCPeerConnectionIceEvent, C, C>
    get() = EventInstance(this, RTCPeerConnectionIceEvent.iceCandidate())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/icecandidateerror_event)
 */
inline val <C : RTCIceTransport> C.iceCandidateErrorEvent: EventInstance<RTCPeerConnectionIceErrorEvent, C, C>
    get() = EventInstance(this, RTCPeerConnectionIceErrorEvent.iceCandidateError())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/selectedcandidatepairchange_event)
 */
inline val <C : RTCIceTransport> C.selectedCandidatePairChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.selectedCandidatePairChange())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/RTCIceTransport/statechange_event)
 */
inline val <C : RTCIceTransport> C.stateChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.stateChange())
