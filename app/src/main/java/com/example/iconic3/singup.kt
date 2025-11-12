package com.example.iconic3

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class singup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_singup)
        
        // Set up click listener for Sign Up button
        val btnSignUp = findViewById<MaterialButton>(R.id.btnSignUp)
        btnSignUp.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
            finish() // Close the current activity
        }
        
        // Set up click listener for Sign In text
        val tvSignIn = findViewById<TextView>(R.id.tvSignIn)
        tvSignIn.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
            finish() // Close the current activity
        }
        
        // Set up click listener for Back button
        val ivBack = findViewById<ImageView>(R.id.ivBack)
        ivBack.setOnClickListener {
            onBackPressed() // Go back to previous activity
        }
        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}