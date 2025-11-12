package com.example.iconic3

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class payment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_payment)

        // Pay -> Placed page
        findViewById<androidx.cardview.widget.CardView>(R.id.payButton)?.setOnClickListener {
            val intent = Intent(this, placed::class.java)
            startActivity(intent)
            finish()
        }

        // Back button -> finish current activity
        findViewById<ImageView>(R.id.backButton)?.setOnClickListener {
            onBackPressed()
        }

        // Bottom navigation clicks
        findViewById<LinearLayout>(R.id.navHome)?.setOnClickListener {
            startActivity(Intent(this, home::class.java))
            finish()
        }
        findViewById<LinearLayout>(R.id.navWishlist)?.setOnClickListener {
            startActivity(Intent(this, wishlist::class.java))
            finish()
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