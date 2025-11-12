package com.example.iconic3

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class wishlist : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_wishlist)

        // Bottom navigation clicks
        findViewById<LinearLayout>(R.id.navHome)?.setOnClickListener {
            startActivity(Intent(this, home::class.java))
            finish()
        }
        findViewById<LinearLayout>(R.id.navWishlist)?.setOnClickListener {
            // Already on wishlist; optionally no-op or refresh
        }
        findViewById<LinearLayout>(R.id.navCart)?.setOnClickListener {
            startActivity(Intent(this, cart::class.java))
            finish()
        }
        findViewById<LinearLayout>(R.id.navProfile)?.setOnClickListener {
            startActivity(Intent(this, profile::class.java))
            finish()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}