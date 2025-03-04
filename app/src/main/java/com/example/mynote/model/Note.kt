package com.example.mynote.model

import java.time.LocalDateTime
import java.util.UUID

data class Note(
    val id: UUID = UUID.randomUUID(),  // will create random, unique universal ids linked to each note
    val title: String,
    val description: String,
    val entryDate: LocalDateTime = LocalDateTime.now()

)
