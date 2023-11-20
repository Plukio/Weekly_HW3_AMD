package com.example.a1_homework

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MyHomeWork : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        val fullScreenImage = findViewById<ImageView>(R.id.imageViewBackground)
        fullScreenImage.setOnClickListener {
            val intent = Intent(this@MyHomeWork, FullScreenActivity::class.java)
            startActivity(intent)

        }


    }
}

