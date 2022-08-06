package org.ushmz

import java.util.*

data class TaskRequest(
    val title: String,
    val description: String,
    val date: Date
)

data class Task(
    val id: Int,
    val title: String,
    val description: String,
    val date: Date
)
