package com.example.instagram

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class ActivityLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val bntCreateAccount: Button = findViewById<Button>(R.id.btnCriarConta)
        bntCreateAccount.setOnClickListener {
            val intent = Intent(this@ActivityLogin, ActivityCreateAccountEmail::class.java)
            startActivity(intent)
        }

        val btnEntrar: Button = findViewById<Button>(R.id.btnEntrar)
        btnEntrar.setOnClickListener {
            val intent = Intent(this@ActivityLogin, ActivityPerfil::class.java)
            startActivity(intent)
        }

        val bntLoginFace: Button = findViewById<Button>(R.id.btnLogarFacebook)
        bntLoginFace.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://pt-br.facebook.com/"));
            startActivity(intent)
        }
    }

}