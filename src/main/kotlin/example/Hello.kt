package example

import kotlin.browser.window

external fun require(lib: String): dynamic

external fun setImmediate(fn: () -> Unit)

fun main(args: Array<String>) {
    require("setimmediate")

    var a = 1
    var b = 2
    window.alert((a + b).toString())

    a = 10
    b = 20
    setImmediate({
        window.alert((a + b).toString())
    })
}



