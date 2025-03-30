plugins {
    `kotlin-library-conventions`
}

dependencies {
    commonMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinReact)
    jsMainApi(projects.kotlinReactDom)

    jsMainImplementation(libs.coroutines.core)
    jsMainImplementation(libs.coroutines.test)

    jsMainApi(npm(libs.npm.reactDom))
}
