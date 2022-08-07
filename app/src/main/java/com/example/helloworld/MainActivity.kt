package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.util.Log
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val introButton = findViewById<Button>(R.id.HelloButton)
        val introText = findViewById<TextView>(R.id.IntroTextView)
        introButton.setOnClickListener{
            Log.v("Hello Word", "Button Clicked!")
            Toast.makeText(this, "Hello to you too!", Toast.LENGTH_SHORT ).show()
            introText.text = "\t\tGopher!!!!!!!!"

        }

    }
}