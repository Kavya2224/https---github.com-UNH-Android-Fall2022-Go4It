package com.example.go4it

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class preferences : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preferences)
    }

    val nextbtn = findViewById<Button>(R.id.nextbtn)


    /*nextbtn.setOnClickListener{
        val Intent = Intent(this,meals::class.java)
        startActivity(Intent)
    }*/


}