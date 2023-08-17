package com.example.mad_practical_4_21012011148
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistrationActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val Login : Button = findViewById(R.id.LoginButton)
        Login.setOnClickListener {
            Intent(this@RegistrationActivity, LoginActivity::class.java).also{startActivity(it)}
        }
    }
}