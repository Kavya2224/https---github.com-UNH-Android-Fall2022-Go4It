package com.example.go4it

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class secondpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondpage)

        val signin = findViewById<Button>(R.id.signinbtn)

        signin.setOnClickListener{
            val Intent = Intent(this,signinpage::class.java)
            startActivity(Intent)
        }

        val signup = findViewById<Button>(R.id.signupbtn)

        signup.setOnClickListener{
            val Intent = Intent(this,signuppage::class.java)
            startActivity(Intent)
        }
    }
}