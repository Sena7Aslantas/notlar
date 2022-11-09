package com.senaaslantas.notdefteri

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun kaydet(view: View){
        val intent=Intent(applicationContext,Notlar::class.java)
        intent.putExtra("tarih",dateText.text.toString())
        intent.putExtra("baslık",baslikText.text.toString())
        intent.putExtra("not",notText.text.toString())
        startActivity(intent)




    }
}