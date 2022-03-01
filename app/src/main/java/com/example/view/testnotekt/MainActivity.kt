package com.example.view.testnotekt

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Slide
import android.view.Gravity
import android.view.Window
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // WriteActivity가 생성될 때 애니매이션 추가

        with(window){
            requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
            // set an slide transition
            enterTransition = Slide().also{
                it.slideEdge = Gravity.BOTTOM
            }
            exitTransition= Slide().also {
                it.slideEdge=Gravity.TOP
            }
        }
        //기본 생성자
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //fab버튼 클릭시 새 액티비티 생성
        val fabButton :FloatingActionButton = this.findViewById(R.id.Main_FabButton_fab)
        fabButton.setOnClickListener{
            val intent = Intent(this, WriteActivity::class.java)
            //애니매이션 옵션 추가
            val options=ActivityOptions.makeSceneTransitionAnimation(this)
            startActivity(intent, options.toBundle())
        }
    }
}