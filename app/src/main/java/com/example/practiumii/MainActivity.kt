package com.example.practiumii

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

  private lateinit var textview: TextView
  private lateinit var button: Button
  private lateinit var imageView: ImageView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        textview = findViewById(R.id.Details)
        button = findViewById(R.id.buttonNextScreen)
        imageView = findViewById(R.id.imageView)


         button.setOnClickListener {
            val intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)

        }
    }
}

