package com.example.botones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kotlin.math.log

class SegundaActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        var fraseRecibida = intent.getStringExtra("Frase")
        var edad = intent.getIntExtra("Edad", 0)

        Log.d("Datos", "Datos rebidos con exito fueron $fraseRecibida y edad $edad")

        var bnAbrirPantalla = findViewById<Button>(R.id.btnPantalla)
        var imagen = false

        var logoIest = findViewById<ImageView>(R.id.logoIest)
        logoIest.setOnClickListener{
            if (imagen == false){
                logoIest.setImageResource(R.drawable.logoanahuac)
                imagen = true
            }else{
                logoIest.setImageResource(R.drawable.logoiest)
                imagen = false
            }
        }
        bnAbrirPantalla.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        }
        var bnCerrar = findViewById<Button>(R.id.bnCerrar)
        /*bnCerrar.setOnClickListener{
            finish()
        }*/
        bnCerrar.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
            when(p0?.id){
                R.id.bnCerrar -> finish()
            }
    }
}