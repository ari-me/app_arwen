package com.example.animationapplication

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textview1=findViewById<TextView>(R.id.textview1)
        val textview2=findViewById<TextView>(R.id.textview2)
        val textview3=findViewById<TextView>(R.id.textview3)
        val image1=findViewById<ImageView>(R.id.imageView1)
        val image2=findViewById<ImageView>(R.id.imageView2)
        val image3=findViewById<ImageView>(R.id.imageView3)
        val button=findViewById<Button>(R.id.button)

        val animation = AnimationUtils.loadAnimation(this, R.anim.anim1)
        textview1.startAnimation(animation)
        val animation2 = AnimationUtils.loadAnimation(this, R.anim.anim2)
        textview2.startAnimation(animation2)
        val animation3 = AnimationUtils.loadAnimation(this, R.anim.anim3)
        textview3.startAnimation(animation3)
        button.setOnClickListener{
            textview1.startAnimation(animation)
            textview2.startAnimation(animation2)
            textview3.startAnimation(animation3)
            image1.startAnimation(animation)
            image2.startAnimation(animation2)
            image3.startAnimation(animation3)
        }
    }
}