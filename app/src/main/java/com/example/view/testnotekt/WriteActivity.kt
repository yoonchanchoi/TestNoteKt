package com.example.view.testnotekt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.MenuItem
import android.view.View
import androidx.appcompat.widget.PopupMenu
import java.io.File

class WriteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_write)
    }


//    private fun showImagePopup(view: View) {
//        PopupMenu(this, view).apply {
//            setOnMenuItemClickListener(this@WriteActivity)
//            inflate(R.menu.menu) //내가 만든 메뉴 넣기
//            show()
//        }
//    }
//
//    override fun onMenuItemClick(item: MenuItem?): Boolean {
//        return when (item!!.itemId) {
//            R.id.menu_write_camera -> {
//                //클릭시 실행되는 곳
//                true
//            }
//            R.id.menu_write_gallery -> {
//                //클릭시 실행되는 곳
//                true
//            }
//            R.id.menu_write_url -> {
//                //클릭시 실행되는 곳
//                true
//            }
//            else -> false
//        }
//    }
//    private fun startCamera() {
//        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
//            takePictureIntent.resolveActivity(packageManager)?.also {
//                val photoFile: File? = try {
//                    createImageFile()
//                } catch (ex: IOException) {
//                    Snackbar.make(
//                        findViewById(R.id.Write_Layout_view),
//                        "이미지를 불러오지 못했습니다.",
//                        Snackbar.LENGTH_LONG
//                    ).show()
//                    null
//                }
//                photoFile?.also {
//                    val photoURI: Uri = FileProvider.getUriForFile(
//                        this,
//                        BuildConfig.APPLICATION_ID,
//                        it
//                    )
//                    takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, photoURI)
//                    startActivityForResult(takePictureIntent, REQUEST_ACTION_IMAGE_CAPTURE)
//                }
//            }
//        }
//    }
}