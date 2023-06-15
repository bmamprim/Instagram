package com.example.instagram

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random
import kotlin.random.nextInt


class ActivityCreateAccountEmail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email)

        val btnChangeToPhone: Button = findViewById(R.id.btnChangeToPhone)
        btnChangeToPhone.setOnClickListener{
            val intent = Intent(this@ActivityCreateAccountEmail, ActivityCreateAccountTelefone::class.java)
            startActivity(intent)
        }

        val btnGoPass: Button = findViewById(R.id.btnAvancar)
        btnGoPass.setOnClickListener{
            val intent2 = Intent(this@ActivityCreateAccountEmail, ActivityCompleteName::class.java)
            startActivity(intent2)
        }
    }

}