package com.example.iconic3

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val main = findViewById<ConstraintLayout>(R.id.activity)

        main.setOnClickListener {
            val intent = Intent(this, onboard1::class.java)
            startActivity(intent)
        }
    }
}