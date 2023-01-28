package com.example.botones

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var edit_Frase : EditText
    private lateinit var TvFrase: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TvFrase = findViewById(R.id.textViewInstruccion)
        edit_Frase  = findViewById(R.id.editTextFrase)
         var bnmostrar = findViewById<Button>(R.id.button_Mostrar)
        bnmostrar.setOnClickListener {
            val FRASE = getFrase()
            Snackbar.make(TvFrase, "Su Frase fue $FRASE",Snackbar.LENGTH_LONG).show()
        }
        var bnSiguiente = findViewById<Button>(R.id.bnSiguiente)
        bnSiguiente.setOnClickListener{
            var i = Intent(this, SegundaActivity::class.java)
            i.putExtra("Frase",getFrase())
            i.putExtra("Edad",21)
            startActivity(i)
        }
    }
    private fun  getFrase():String{
        return edit_Frase.text.toString()
    }
}