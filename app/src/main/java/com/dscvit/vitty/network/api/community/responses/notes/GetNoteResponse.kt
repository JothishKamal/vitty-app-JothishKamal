package com.dscvit.vitty.network.api.community.responses.notes

import com.dscvit.vitty.model.Note

data class GetNoteNoNotesResponse(
    val data: String
)

data class GetNoteSuccessResponse(
    val data: List<Note>
)

sealed class GetNoteResponse {
    data class Success(val notes: List<Note>) : GetNoteResponse()
    data class NoNotes(val message: String) : GetNoteResponse()
}
