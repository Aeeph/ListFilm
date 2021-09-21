package com.example.uikabogor

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Radio : AppCompatActivity() {
    private var rgSifat: RadioGroup? = null
    private var pilihan: RadioButton? = null
    private var btnpilih: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio)

        //memanggil variable dari layout
        rgSifat = findViewById(R.id.rgSifat)
        btnpilih = findViewById(R.id.btnsubmit)

        //bikin fungsi yang dipanggil di dalam class
        tampilkanpilihan()
    }

    private fun tampilkanpilihan() {
        btnpilih!!.setOnClickListener { //Memilih id radio button dalam radio group
            val selectedId = rgSifat!!.checkedRadioButtonId

            //Menentukan id radio button yg terpilih
            pilihan = findViewById(selectedId)

            //menampilkan pilihan dalam toast
        }
    }
}