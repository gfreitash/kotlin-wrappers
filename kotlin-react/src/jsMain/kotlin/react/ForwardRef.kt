package react

import js.objects.Object
import js.objects.jso
import js.reflect.unsafeCast
import react.raw.forwardRefRaw

fun <P : PropsWithRef<*>> ForwardRef(
    block: @ReactDsl ChildrenBuilder.(props: P) -> Unit,
): ForwardRefExoticComponent<P> =
    unsafeCast(ForwardRefInternal<Any, _>(block = unsafeCast(block)))

private fun <T : Any, P : PropsWithRef<T>> ForwardRefInternal(
    block: @ReactDsl ChildrenBuilder.(props: P) -> Unit,
): ForwardRefExoticComponent<P> =
    forwardRefRaw { props, forwardedRef ->
        val finalProps = forwardRefProps(props, forwardedRef)
        createElementOrNull { block(finalProps) }
    }

private fun <T : Any, P : PropsWithRef<T>> forwardRefProps(
    props: P,
    forwardedRef: Ref<T>?,
): P {
    forwardedRef ?: return props

    return Object.freeze(
        Object.assign(
            jso { ref = forwardedRef },
            props,
        )
    )
}
