package com.example.mynote.data

import com.example.mynote.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(
                title = "Grocery List",
                description = "Milk, Eggs, Bread, Butter, Apples"
            ),
            Note(
                title = "Work Tasks",
                description = "Finish report, Schedule meeting, Reply to emails"
            ),
            Note(
                title = "Weekend Plans",
                description = "Visit the park, Watch a movie, Call friends"
            ),
            Note(
                title = "Fitness Goals",
                description = "Run 5km, Do yoga, Drink more water"
            ),
            Note(
                title = "Book Recommendations",
                description = "The Alchemist, Sapiens, Atomic Habits"
            )
        )
    }
}