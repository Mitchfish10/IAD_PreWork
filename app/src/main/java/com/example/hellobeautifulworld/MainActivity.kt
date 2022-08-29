package com.example.hellobeautifulworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.helloButton)
        button.setOnClickListener {
            Log.v("Helloworld", "Button Clicked!")
            Toast.makeText(this, "Hello Beautiful! 😘", Toast.LENGTH_SHORT).show()
        }
    }
}