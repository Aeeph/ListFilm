package com.example.uikabogor

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    private var Btnlogin: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val username = findViewById<View>(R.id.Name) as EditText
        val password = findViewById<View>(R.id.Pss) as EditText
        Btnlogin = findViewById<View>(R.id.btnLogin) as Button
        Btnlogin!!.setOnClickListener {
            val name = username.text.toString()
            val pass = password.text.toString()
            if (name == "admin" && pass == "admin") {
                Toast.makeText(applicationContext, "Anda Berhasil Login", Toast.LENGTH_SHORT).show()
                val profil = Intent(this@Login, dashboard::class.java)
                startActivity(profil)
            } else {
                Toast.makeText(
                    applicationContext,
                    "Username dan Password Tidak Sesuai",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}