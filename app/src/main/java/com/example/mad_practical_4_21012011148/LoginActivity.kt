package com.example.mad_practical_4_21012011148
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

        val Register:Button = findViewById(R.id.signup)
        Register.setOnClickListener {
            Intent(this@LoginActivity,RegistrationActivity::class.java).also { startActivity(it) }
        }
    }
}