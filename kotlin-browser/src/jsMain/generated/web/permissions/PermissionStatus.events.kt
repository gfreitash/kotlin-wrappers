// Automatically generated - do not modify!

package web.permissions

import web.events.Event
import web.events.EventInstance

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PermissionStatus/change_event)
 */
inline val <C : PermissionStatus> C.changeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, Event.change())
