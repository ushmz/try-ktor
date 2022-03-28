package org.ushmz.infrastructure.repositoryimple

import org.ushmz.domain.User
import org.ushmz.domain.UserRequest
import org.ushmz.interfaces.repository.UserRepository

class UserRepositoryImpl : UserRepository {
	override fun getByID(id: Int): User {
		TODO("Not yet implemented")
	}

	override fun getAll(): Array<User> {
		TODO("Not yet implemented")
	}

	override fun create(t: UserRequest): User {
		TODO("Not yet implemented")
	}

	override fun update(t: User): User {
		TODO("Not yet implemented")
	}

	override fun delete(id: Int): User {
		TODO("Not yet implemented")
	}
}