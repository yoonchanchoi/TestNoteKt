package com.example.view.testnotekt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.view.testnotekt.Room.Diary

class MainDiaryAdaper(
    private val diary: List<Diary>
) : RecyclerView.Adapter<MainDiaryAdaper.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.main_fragment_diary, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = diary[position]
        holder.title.text = item.title
        holder.content.text = item.content
    }

    override fun getItemCount(): Int = diary.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.diary_title)
        val content: TextView = view.findViewById(R.id.diary_content)

    }
}