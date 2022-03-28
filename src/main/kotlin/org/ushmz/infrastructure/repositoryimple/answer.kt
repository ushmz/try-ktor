package org.ushmz.infrastructure.repositoryimple

import org.ushmz.domain.Answer
import org.ushmz.domain.AnswerRequest
import org.ushmz.interfaces.repository.AnswerRepository

class AnswerRepositoryImpl : AnswerRepository {
	override fun getByID(id: Int): Answer {
		TODO("Not yet implemented")
	}

	override fun getAll(): Array<Answer> {
		TODO("Not yet implemented")
	}

	override fun create(t: AnswerRequest): Answer {
		TODO("Not yet implemented")
	}

	override fun update(t: Answer): Answer {
		TODO("Not yet implemented")
	}

	override fun delete(id: Int): Answer {
		TODO("Not yet implemented")
	}
}