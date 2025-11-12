package com.example.iconic3

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        // Product image clicks -> navigate to product1
        val productImageIds = listOf(R.id.ivProduct1, R.id.ivProduct2, R.id.ivProduct3, R.id.ivProduct4)
        for (imageId in productImageIds) {
            val imageView = findViewById<ImageView>(imageId)
            imageView?.setOnClickListener {
                val intent = Intent(this, product1::class.java)
                startActivity(intent)
            }
        }

        // Bottom navigation clicks
        findViewById<LinearLayout>(R.id.navWishlist)?.setOnClickListener {
            startActivity(Intent(this, wishlist::class.java))
        }
        findViewById<LinearLayout>(R.id.navCart)?.setOnClickListener {
            startActivity(Intent(this, cart::class.java))
        }
        findViewById<LinearLayout>(R.id.navProfile)?.setOnClickListener {
            startActivity(Intent(this, profile::class.java))
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}