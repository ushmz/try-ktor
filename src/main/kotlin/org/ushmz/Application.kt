package org.ushmz

import io.ktor.server.application.*

// fun main() {
//     embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
//         configureRouting()
//     }.start(wait = true)
// }

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    configureRouting()
}