package com.example.instagram

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class ActivityPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password)

        val btnAvancar: Button = findViewById(R.id.btnAvancar)
        btnAvancar.setOnClickListener{
            val intent = Intent(this@ActivityPassword, ActivityUserName::class.java)
            startActivity(intent)
        }
    }

}