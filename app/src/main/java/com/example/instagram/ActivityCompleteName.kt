package com.example.instagram

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class ActivityCompleteName : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        val btnAvancar: Button = findViewById(R.id.btnAvancar)
        btnAvancar.setOnClickListener{
            val intent = Intent(this@ActivityCompleteName, ActivityPassword::class.java)
            startActivity(intent)
        }
    }

}