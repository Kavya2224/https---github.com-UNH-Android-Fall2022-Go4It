package com.example.go4it

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getstarted = findViewById<Button>(R.id.getstartedbtn)

        getstarted.setOnClickListener{
            val Intent = Intent(this,secondpage::class.java)
            startActivity(Intent)
        }
    }
}