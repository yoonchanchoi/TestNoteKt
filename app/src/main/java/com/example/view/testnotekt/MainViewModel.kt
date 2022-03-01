package com.example.view.testnotekt

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.view.testnotekt.Repository.Repository
import com.example.view.testnotekt.Room.Diary

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = Repository(application)
    private val diarys = repository.getAll()

    fun getAll(): LiveData<List<Diary>>{
        return this.diarys
    }

    fun insert(diary: Diary){
        repository.insert(diary)
    }

    fun delete(diary: Diary){
        repository.delete(diary)
    }

}