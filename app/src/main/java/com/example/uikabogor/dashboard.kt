package com.example.uikabogor

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_dashboard.*

class dashboard : AppCompatActivity() {
    private var btnProfil: Button? = null
    private var btnCheck: Button? = null
    private var btnRadio: Button? = null
    private var btnPilihan: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        //Mengambil variable id button dari layout
        btnProfil = findViewById(R.id.btnprofil)
        btnCheck = findViewById(R.id.btncheck)
        btnRadio = findViewById(R.id.btnradio)
        btnPilihan = findViewById(R.id.btnMovie)
        //memberikan action pada objek button
        btnProfil?.setOnClickListener(View.OnClickListener { //aksi button nya
            Toast.makeText(applicationContext, "Anda Mengakses Halaman Profile", Toast.LENGTH_SHORT)
                .show()
            val profil = Intent(this@dashboard, profil::class.java)
            startActivity(profil)
        })
        btnCheck?.setOnClickListener(View.OnClickListener { //aksi ke halaman checkbox
            Toast.makeText(applicationContext,"Anda Mengakses Halaman CheckBox",Toast.LENGTH_SHORT)
                .show()
            val check = Intent(this@dashboard, Check::class.java)
            startActivity(check)
        })
        btnRadio?.setOnClickListener(View.OnClickListener { //aksi ke halaman checkbox
            Toast.makeText(applicationContext, "Anda Mengakses Halaman Radio", Toast.LENGTH_SHORT)
                .show()
            val radio = Intent(this@dashboard, Radio::class.java)
            startActivity(radio)
        })
        btnMovie?.setOnClickListener(View.OnClickListener { //aksi ke halaman checkbox
            Toast.makeText(applicationContext, "Anda Mengakses Halaman Movie", Toast.LENGTH_SHORT)
                .show()
            val movie = Intent(this@dashboard, Movie::class.java)
            startActivity(movie)
        })
    }
}