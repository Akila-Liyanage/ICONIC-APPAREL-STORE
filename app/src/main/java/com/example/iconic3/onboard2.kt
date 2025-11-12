package com.example.iconic3

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.constraintlayout.widget.ConstraintLayout

class onboard2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard2)
        
        // Skip button -> Login page
        findViewById<TextView>(R.id.skipButton)?.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
            finish()
        }
        
        // Next button -> onboard3
        findViewById<TextView>(R.id.next_button_onboard2)?.setOnClickListener {
            val intent = Intent(this, onboard3::class.java)
            startActivity(intent)
            finish()
        }
        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.activity)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
