package com.example.view.testnotekt.Room

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface DiaryDao {



    //id가 같을 경우 대체
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(diary: Diary)

    @Query("SELECT * FROM diary")
    fun getAll(): LiveData<List<Diary>>

    @Query("SELECT * FROM diary WHERE _id IN (:diaryIds)")
    fun loadAllByIds(diaryIds: IntArray): List<Diary>

    @Query("SELECT * FROM diary WHERE title LIKE :title AND " +
            "content LIKE :content LIMIT 1")
    fun findByTitle_content(title: String, content: String): Diary

    @Insert
    fun insertAll(vararg diaries: Diary)

    @Delete
    fun delete(Diary: Diary)


}