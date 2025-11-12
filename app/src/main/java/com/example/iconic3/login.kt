package com.example.iconic3

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        
        // Set up click listener for Sign In button
        val btnSignIn = findViewById<MaterialButton>(R.id.btnSignIn)
        btnSignIn.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
            finish() // Close the current activity
        }
        
        // Set up click listener for Sign Up text
        val tvSignUp = findViewById<TextView>(R.id.tvSignUp)
        tvSignUp.setOnClickListener {
            val intent = Intent(this, singup::class.java)
            startActivity(intent)
        }
        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.loginid)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}