package org.ushmz.domain

data class AnswerRequest(
	val userID: Int,
	val taskID: Int,
	val answer: String,
	val reason: String,
)

data class Answer(
	val id: Int,
	val userID: Int,
	val taskID: Int,
	val answer: String,
	val reason: String,
)
