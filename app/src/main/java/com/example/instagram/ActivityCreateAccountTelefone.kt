package com.example.instagram

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class ActivityCreateAccountTelefone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telefone)

        val btnChangeToEmail: Button = findViewById(R.id.btnChangeToEmail)
        btnChangeToEmail.setOnClickListener{
            val intent = Intent(this@ActivityCreateAccountTelefone, ActivityCreateAccountEmail::class.java)
            startActivity(intent)
        }

        val btnGoPass: Button = findViewById(R.id.btnAvancar)
        btnGoPass.setOnClickListener{
            val intent = Intent(this@ActivityCreateAccountTelefone, ActivityCompleteName::class.java)
            startActivity(intent)
        }
    }

}