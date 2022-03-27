package org.ushmz.interfaces.controller

data class TaskResponse(
	val id: Int,
	val externalID: String,
	val completionCode: String,
)

class TaskController {
	fun get(id: Int): TaskResponse {
		return TaskResponse(42, "ext42", "20664")
	}

	fun list(): Array<TaskResponse> {
		return arrayOf<TaskResponse>()
	}

	fun create() {}
	fun update() {}
	fun delete(id: Int) {}
}