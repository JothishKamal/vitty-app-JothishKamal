package com.dscvit.vitty.model

data class Note(
    val noteId: String,
    val noteName: String,
    val userName: String,
    val courseId: String,
    val courseName: String,
    val noteContent: String,
)