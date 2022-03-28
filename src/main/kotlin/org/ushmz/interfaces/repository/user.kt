package org.ushmz.interfaces.repository

import org.ushmz.domain.User
import org.ushmz.domain.UserRequest

interface UserRepository {
	fun getByID(id: Int): User
	fun getAll(): Array<User>
	fun create(t: UserRequest): User
	fun update(t: User): User
	fun delete(id: Int): User
}
