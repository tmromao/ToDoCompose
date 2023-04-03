package com.example.todocompose.data

import androidx.room.*
import com.example.todocompose.data.models.ToDoTask
import kotlinx.coroutines.flow.Flow

@Dao
interface ToDoDao {

    @Query("SELECT * FROM todo_table ORDER BY id ASC")
    fun getAllTasks(): Flow<List<ToDoTask>>

    @Query("SELECT * FROM todo_table WHERE id = :taskId")
    fun getSelectedTask(taskId: Int): Flow<ToDoTask>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addTask(toDoTask: ToDoTask)

    @Update
    suspend fun updateTask(toDoTask: ToDoTask)

    @Delete
    suspend fun deleteTask(toDoTask: ToDoTask)

    @Query("DELETE FROM todo_table")
    suspend fun deleteAllTasks()

    @Query("SELECT * FROM todo_table WHERE title LIKE '%' || :searchQuery || '%' OR " +
            "description LIKE '%' || :searchQuery || '%'")
    fun searchDatabase(searchQuery: String): Flow<List<ToDoTask>>

    @Query("SELECT * FROM todo_table ORDER BY CASE WHEN priority = 'HIGH' THEN 1 " +
            "WHEN priority = 'MEDIUM' THEN 2 WHEN priority = 'LOW' THEN 3 " +
            "ELSE 4 END")
    fun sortByHighPriority(): Flow<List<ToDoTask>>

    @Query("SELECT * FROM todo_table ORDER BY CASE WHEN priority = 'HIGH' THEN 1 " +
            "WHEN priority = 'MEDIUM' THEN 2 WHEN priority = 'LOW' THEN 3 " +
            "ELSE 4 END")
    fun sortByLowPriority(): Flow<List<ToDoTask>>
}