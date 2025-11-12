package com.example.iconic3

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class onboard3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard3)
        
        // Skip button -> Login page
        findViewById<TextView>(R.id.skipButton)?.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
            finish()
        }
        
        // Set up click listener for the next button
        val nextButton = findViewById<TextView>(R.id.next_button_onboard2)
        nextButton.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
            finish() // Close the current activity
        }
        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.next_button_onboard2)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}