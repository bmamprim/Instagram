package com.example.instagram

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class ActivityWelcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val btnConcluir: Button = findViewById(R.id.btnConcluir)
        btnConcluir.setOnClickListener{
            val intent = Intent(this@ActivityWelcome, ActivityPerfil::class.java)
            startActivity(intent)
        }
    }

}