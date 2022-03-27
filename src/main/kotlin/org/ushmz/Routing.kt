package org.ushmz

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

	// Starting point for a Ktor app:
	routing {
		get("/") {
			call.respondText("Hello World!")
		}
		get("/greet") {
			call.respondText("Keep greeting to world forever!")
		}
	}
	// answer
	routing {
		// List all answers.
		get("/answer") {
			call.response.status(HttpStatusCode.OK)
			call.respondText("Get all answers")
		}

		// Get answer by ID
		get("/answer/{id}") {
			call.respondText("Get answer by ID", ContentType.Text.Plain, HttpStatusCode.OK)
		}

		// Create new answer.
		post("/answer/{id}") {
			call.respondText("Get answer by ID", ContentType.Text.Plain, HttpStatusCode.OK)
		}

		// Update answer by ID
		put("/answer/{id}") {
			call.respondText("Get answer by ID", ContentType.Text.Plain, HttpStatusCode.OK)
		}

		// Delete answer by ID
		delete("/answer/{id}") {
			call.respondText("Get answer by ID", ContentType.Text.Plain, HttpStatusCode.OK)
		}
	}

	// task
	routing {
		// List all tasks.
		get("/task") {
			call.response.status(HttpStatusCode.OK)
			call.respondText("Get all tasks")
		}

		// Get task by ID.
		get("/task/{id}") {
			call.respondText("Get task by ID", ContentType.Text.Plain, HttpStatusCode.OK)
		}

		// Create new task.
		post("/task/{id}") {
			call.respondText("Create task by ID", ContentType.Text.Plain, HttpStatusCode.Created)
		}

		// Update task by ID.
		put("/task/{id}") {
			call.respondText("Update task by ID", ContentType.Text.Plain, HttpStatusCode.Accepted)
		}

		// Delete task by ID.
		delete("/task/{id}") {
			call.respondText("Delete task by ID", ContentType.Text.Plain, HttpStatusCode.NoContent)
		}
	}

	// user
	routing {
		// List all users.
		get("/user") {
			call.response.status(HttpStatusCode.OK)
			call.respondText("Get all users")
		}

		// Get user by ID.
		get("/user/{id}") {
			call.respondText("Get user by ID", ContentType.Text.Plain, HttpStatusCode.OK)
		}

		// Create new user.
		post("/user/{id}") {
			call.respondText("Create user by ID", ContentType.Text.Plain, HttpStatusCode.Created)
		}

		// Update user by ID.
		put("/user/{id}") {
			call.respondText("Update user by ID", ContentType.Text.Plain, HttpStatusCode.Accepted)
		}

		// Delete user by ID.
		delete("/user/{id}") {
			call.respondText("Delete user by ID", ContentType.Text.Plain, HttpStatusCode.NoContent)
		}
	}
}
