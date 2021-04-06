package jessal.com.plugins

import io.ktor.routing.*
import io.ktor.application.*
import io.ktor.response.*

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        get("/hello"){
            call.respond(Message("jessal"))
        }
    }
}


data class Message( var name:String = "" )