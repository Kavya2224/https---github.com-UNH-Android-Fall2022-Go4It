package com.example.go4it

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class signinpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signinpage)

        val signin = findViewById<Button>(R.id.signinbtn2)

        signin.setOnClickListener{
            val Intent = Intent(this,preferences::class.java)
            startActivity(Intent)
        }



        //supportActionBar!!.setDisplayHomeAsUpEnabled(true)

    }
}