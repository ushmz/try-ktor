package org.ushmz

import kotlinx.serialization.Serializable

@Serializable
data class TaskResponse(
    val id: Int,
    val name: String,
    val date: String
)

class TaskController {
    fun get(id: Int): TaskResponse {
        return TaskResponse(id, "ext42", "20664")
    }

    fun list(): Array<TaskResponse> {
        return arrayOf<TaskResponse>(
            TaskResponse(1, "ext42", "20664"),
            TaskResponse(2, "ext42", "20664"),
            TaskResponse(3, "ext42", "20664"),
            TaskResponse(4, "ext42", "20664"),
            TaskResponse(5, "ext42", "20664"),
            TaskResponse(5, "ext42", "20664")
        )
    }

    fun create(name: String, date: String): TaskResponse {
        return TaskResponse(42, name, date)
    }

    fun update(id: Int, name: String, date: String): TaskResponse {
        return TaskResponse(id, name, date)
    }

    fun delete(id: Int): TaskResponse {
        return TaskResponse(id, "ext42", "20664")
    }
}
