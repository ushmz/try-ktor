package org.ushmz.interfaces.controller

data class AnswerResponse(
	val id: Int,
	val userID: Int,
	val taskID: Int,
	val conditionID: Int,
	val answer: String,
	val reason: String,
)

class AnswerController {
	fun get(id: Int): AnswerResponse {
		return AnswerResponse(42, 42, 5, 3, "42", "reason")
	}

	fun list(): Array<AnswerResponse> {
		return arrayOf<AnswerResponse>()
	}

	fun create() {}
	fun update() {}
	fun delete(id: Int) {}
}
