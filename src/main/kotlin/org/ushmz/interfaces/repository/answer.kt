package org.ushmz.interfaces.repository

import org.ushmz.domain.Answer
import org.ushmz.domain.AnswerRequest

interface AnswerRepository {
	fun getByID(id: Int): Answer
	fun getAll(): Array<Answer>
	fun create(t: AnswerRequest): Answer
	fun update(t: Answer): Answer
	fun delete(id: Int): Answer
}