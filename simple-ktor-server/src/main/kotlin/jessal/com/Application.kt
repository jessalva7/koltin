package jessal.com

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.server.engine.*
import io.ktor.server.tomcat.*
import jessal.com.plugins.*
import io.ktor.gson.*


fun main() {

    embeddedServer(Tomcat, port = 8080, host = "0.0.0.0") {
        install(ContentNegotiation) {
            gson{
                setPrettyPrinting()
                disableHtmlEscaping()
            }
        }
        configureRouting()
    }.start(wait = true)
}
