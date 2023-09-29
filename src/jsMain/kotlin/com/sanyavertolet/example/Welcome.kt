/**
 * File that contains several `FC`s to preview as well as wrapper function
 *
 * In order to see preview, press run icon near `val Welcome` or `val test`
 */
@file:Suppress("unused")

package com.sanyavertolet.example

import com.sanyavertolet.kotlinjspreview.JsPreview
import com.sanyavertolet.kotlinjspreview.RootWrapper
import react.FC
import react.create
import react.dom.client.createRoot
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.input
import react.useState
import web.dom.document
import web.html.InputType

/**
 * A component you would like to preview
 */
@JsPreview
val Welcome = FC {
    var name by useState("sanyavertolet")
    div {
        +"Hello, $name"
    }
    input {
        type = InputType.text
        value = name
        onChange = { event ->
            name = event.target.value
        }
    }
}

/**
 * A component you would like to preview
 */
@JsPreview
val test = FC {
    div {
        +"testing"
    }
}

/**
 * [wrapper] is a function that finds div that has `wrapper` id and renders [fc] in it
 */
@RootWrapper
fun wrapper(fc: FC<*>) {
    val mainDiv = document.getElementById("wrapper")!!
    createRoot(mainDiv).render(
        fc.create(),
    )
}

/**
 * [default] is a default component to render
 */
val default = FC { +"DEFAULT" }

/**
 * Entry point should be your wrapper function
 */
fun main() = wrapper(default)
