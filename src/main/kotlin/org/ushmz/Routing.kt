package org.ushmz // ktlint-disable filename

import io.ktor.http.HttpStatusCode
import io.ktor.resources.Resource
import io.ktor.server.application.Application
import io.ktor.server.application.call
import io.ktor.server.resources.delete
import io.ktor.server.resources.get
import io.ktor.server.resources.post
import io.ktor.server.resources.put
import io.ktor.server.response.respond
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.route
import io.ktor.server.routing.routing
import kotlinx.serialization.Serializable
import org.ushmz.interfaces.controller.TaskController

fun Application.configureRouting() {
    // Starting point for a Ktor app:
    routing {
        get("/") { call.respondText("Hello World!") }
        get("/greet") { call.respondText("Keep greeting to world forever!") }

        route("/tasks") {
            get("/") {
                val tasks = TaskController().list()
                call.respond(status = HttpStatusCode.OK, tasks)
            }

            @Serializable
            @Resource("/{taskID}")
            data class GetTaskRequest(var taskID: Int)
            get<GetTaskRequest> { req ->
                val task = TaskController().get(req.taskID)
                call.respond(status = HttpStatusCode.OK, task)
            }

            @Serializable
            @Resource("/")
            data class PostTaskRequest(var name: String, var date: String)
            post<PostTaskRequest> { req ->
                val task = TaskController().create(req.name, req.date)
                call.respond(status = HttpStatusCode.Created, task)
            }

            @Serializable
            @Resource("/{taskID}")
            data class PutTaskRequest(val taskID: Int, val name: String, val due: String)
            put<PutTaskRequest> { req ->
                TaskController().update(req.taskID, req.name, req.due)
                call.respond(status = HttpStatusCode.OK, "")
            }

            @Serializable
            @Resource("/{taskID}")
            data class DeleteTaskRequest(var taskID: Int)
            delete<DeleteTaskRequest> { req ->
                TaskController().delete(req.taskID)
                call.respondText("Deleted", status = HttpStatusCode.OK)
            }

            route("/{taskID}/steps") {
                @Serializable
                @Resource("/")
                data class ListStepsRequest(var taskID: Int)
                get<ListStepsRequest> { req ->
                    call.respond(status = HttpStatusCode.OK, "")
                }

                @Serializable
                @Resource("/{setpID}")
                data class GetStepRequest(var taskID: Int, var setpID: Int)
                get<GetStepRequest> { req ->
                    call.respond(status = HttpStatusCode.OK, "")
                }

                @Serializable
                @Resource("/")
                data class PostStepRequest(var taskID: Int, var name: String, var date: String)
                post<PostTaskRequest> { req ->
                    call.respond(status = HttpStatusCode.Created, "")
                }

                @Serializable
                @Resource("/{setpID}")
                data class PutStepRequest(var taskID: Int, var setpID: Int, var name: String, var date: String)
                put<PutTaskRequest> { req ->
                    call.respond(status = HttpStatusCode.OK, "")
                }

                @Serializable
                @Resource("/{setpID}")
                data class DeleteStepRequest(var taskID: Int, var setpID: Int)
                delete<DeleteStepRequest> { req ->
                    call.respond(status = HttpStatusCode.OK, "")
                }
            }
        }
    }
}
