package com.senaaslantas.notdefteri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_notlar.*


class Notlar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notlar)

        Toast.makeText(applicationContext,"Notunuz Kaydedildi", Toast.LENGTH_LONG).show()

        val intent = intent
        val tarih = intent.getStringExtra("tarih")
        val baslık = intent.getStringExtra("baslık")
        val not = intent.getStringExtra("not")

        dateNextText.text = "Tarih: "+tarih
        baslıkNextText.text = "Baslık: "+baslık
        notNextText.text = "Not: "+not


    }
    fun geri(view: View){
        val intent= Intent(applicationContext,MainActivity::class.java)
        val alert=AlertDialog.Builder(this)
        alert.setTitle("Geri Git")
        alert.setMessage("Are You Sure?")
        alert.setPositiveButton("Yes"){dialog,which->

            val intent= Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
        }
        alert.setNegativeButton("No"){diolog,which->
            Toast.makeText(applicationContext,"Geri Gidilmedi", Toast.LENGTH_LONG).show()

        }

        alert.show()



    }

}


