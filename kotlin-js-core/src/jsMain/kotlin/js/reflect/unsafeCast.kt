package js.reflect

actual inline fun <T : Any> unsafeCast(
    value: String,
): T =
    value.unsafeCast<T>()

actual inline fun <T : Any> unsafeCast(
    value: String?,
): T? =
    value.unsafeCast<T?>()

actual inline fun <T> unsafeCast(
    value: Any?,
): T =
    value.unsafeCast<T>()
