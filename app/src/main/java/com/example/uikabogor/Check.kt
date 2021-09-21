package com.example.uikabogor

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Check : AppCompatActivity() {
    private var cBaca: CheckBox? = null
    private var cNulis: CheckBox? = null
    private var cNari: CheckBox? = null
    private var cHitung: CheckBox? = null
    private var cDongeng: CheckBox? = null
    private var cSholat: CheckBox? = null
    private var btnPilihan: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check)
        cBaca = findViewById(R.id.checkBoxBaca)
        cNulis = findViewById(R.id.checkBoxNulis)
        cHitung = findViewById(R.id.checkBoxHitung)
        cNari = findViewById(R.id.checkBoxNari)
        cDongeng = findViewById(R.id.checkBoxDongeng)
        cSholat = findViewById(R.id.checkBoxSholat)
        btnPilihan = findViewById(R.id.btnPilihan)
    }
}