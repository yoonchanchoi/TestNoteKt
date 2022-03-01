package com.example.view.testnotekt.Repository

import android.app.Application
import androidx.lifecycle.LiveData
import com.example.view.testnotekt.Room.AppDatabase
import com.example.view.testnotekt.Room.Diary

class Repository (application: Application){
    private val database = AppDatabase.getInstance(application)!!
    private val diaryDao = database.diaryDao()
    private val diarys: LiveData<List<Diary>> = diaryDao.getAll()

    fun getAll(): LiveData<List<Diary>>{
        return diarys
    }

    fun insert(diary: Diary){
        try{
            val thread = Thread(Runnable { diaryDao.insert(diary) })
            thread.start()
        } catch (e: Exception) {}
    }

    fun delete(diary: Diary) {
        try {
            val thread = Thread(Runnable {
                diaryDao.delete(diary)
            })
            thread.start()
        } catch (e: Exception) { }
    }
}