package org.ushmz.domain

data class TaskRequest(
	val title: String,
	val query: String,
	val description: String,
	val searchURL: String,
)

data class Task(
	val id: Int,
	val title: String,
	val query: String,
	val description: String,
	val searchURL: String,
)
