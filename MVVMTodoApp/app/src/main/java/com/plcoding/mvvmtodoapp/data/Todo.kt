package com.plcoding.mvvmtodoapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Todo(
    val title: String,
    val description: String?,
    val isDone: Boolean,
    // Unique ID - Room will generate if we don't pass a value:
    @PrimaryKey val id: Int? = null
)
