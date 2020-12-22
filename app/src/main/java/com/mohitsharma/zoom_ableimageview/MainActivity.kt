package com.mohitsharma.zoom_ableimageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.github.chrisbanes.photoview.PhotoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gfgLogoUrl = "https://media.geeksforgeeks.org/wp-content/cdn-uploads/20190710102234/download3.png"
        val imageView = findViewById<PhotoView>(R.id.image_view)
        Glide.with(this)
            .load(gfgLogoUrl)
            .into(imageView)
    }
}