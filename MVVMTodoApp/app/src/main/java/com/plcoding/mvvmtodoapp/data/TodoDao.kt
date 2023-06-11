package com.plcoding.mvvmtodoapp.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

/* Data Access Object.
It is used to access to our data. It defines the different ways of accessing our data.

*/
@Dao
interface TodoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTodo(todo: Todo)

    @Delete
    suspend fun deleteTodo(todo: Todo)

    @Query("SELECT * FROM todo WHERE id = :id")
    suspend fun getTodoById(id: Int): Todo?

    @Query("SELECT * FROM todo")
    fun getTodos(): Flow<List<Todo>>
}