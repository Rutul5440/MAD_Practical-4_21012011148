package com.example.mad_practical_4_21012011148

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val  Login:Button = findViewById(R.id.login)
        val signup:Button = findViewById(R.id.signup)
        

    }
}