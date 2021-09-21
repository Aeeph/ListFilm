package com.example.uikabogor

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val waktu = 4000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({ //Fungsi Intent
            val splash = Intent(this@MainActivity, Login::class.java)
            startActivity(splash)
            finish()
        }, waktu.toLong())
    }
}