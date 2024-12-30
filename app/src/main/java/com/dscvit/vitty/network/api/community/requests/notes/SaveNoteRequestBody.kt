package com.dscvit.vitty.network.api.community.requests.notes

data class SaveNoteRequestBody(
    val noteId: String? = null, // Optional for create requests
    val noteName: String,
    val userName: String,
    val courseId: String,
    val courseName: String,
    val noteContent: String
)
