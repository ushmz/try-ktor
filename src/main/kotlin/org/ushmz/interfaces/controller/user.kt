package org.ushmz.interfaces.controller

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

data class UserResponse(
    val id: Int,
    val externalID: String,
    val completionCode: String,
)

class UserController {
    fun get(id: Int): UserResponse {
        return UserResponse(42, "ext42", "20664")
    }

    fun list(): Array<UserResponse> {
        return arrayOf<UserResponse>()
    }

    fun create() {}
    fun update() {}
    fun delete(id: Int) {}
}
