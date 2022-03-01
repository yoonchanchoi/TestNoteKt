package com.example.view.testnotekt.Room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "diary")
data class Diary(
    @PrimaryKey(autoGenerate = true) val _id: Int,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "content") val content: String?
)