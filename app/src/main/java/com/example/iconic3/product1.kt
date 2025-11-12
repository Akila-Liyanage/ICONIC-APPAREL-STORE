package com.example.iconic3

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class product1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_product1)

        // Top back button
        findViewById<ImageView>(R.id.backButton)?.setOnClickListener {
            onBackPressed()
        }

        // Buy Now -> Payment page
        findViewById<androidx.cardview.widget.CardView>(R.id.buyNowButton)?.setOnClickListener {
            val intent = Intent(this, payment::class.java)
            startActivity(intent)
        }

        // Add to Cart -> Cart page
        findViewById<androidx.cardview.widget.CardView>(R.id.addToCartButton)?.setOnClickListener {
            val intent = Intent(this, cart::class.java)
            startActivity(intent)
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