package org.ushmz.infrastructure.repositoryimple

import org.ushmz.domain.Task
import org.ushmz.domain.TaskRequest
import org.ushmz.interfaces.repository.TaskRepository

class TaskRepositoryImpl : TaskRepository {
	override fun getByID(id: Int): Task {
		TODO("Not yet implemented")
	}

	override fun getAll(): Array<Task> {
		TODO("Not yet implemented")
	}

	override fun create(t: TaskRequest): Task {
		TODO("Not yet implemented")
	}

	override fun update(t: Task): Task {
		TODO("Not yet implemented")
	}

	override fun delete(id: Int): Task {
		TODO("Not yet implemented")
	}
}