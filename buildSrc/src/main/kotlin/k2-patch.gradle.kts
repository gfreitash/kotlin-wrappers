val k2patch by tasks.registering {
    doLast {
        patchFile("gradle.properties") {
            it.replace(
                "kotlin.version=1.9.23",
                "kotlin.version=2.0.0-RC2",
            )
        }
    }
}

fun patchFile(
    path: String,
    transform: (String) -> String,
) {
    val file = rootProject.file(path)
    val content = file.readText()
    file.writeText(transform(content))
}
