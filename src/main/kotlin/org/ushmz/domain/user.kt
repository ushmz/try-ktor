package org.ushmz.domain

data class UserRequest(
	val externalID: String,
)

data class User(
	val id: Int,
	val externalID: String,
)
