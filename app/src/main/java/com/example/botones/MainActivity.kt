package com.example.botones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var TvFrase: TextView
        TvFrase = findViewById(R.id.textViewInstruccion)
        var edit_Frase : EditText = findViewById(R.id.editTextFrase)
         var bnmostrar = findViewById<Button>(R.id.button_Mostrar)
        bnmostrar.setOnClickListener {
            val FRASE = edit_Frase.text.toString()
            Snackbar.make(TvFrase, "Su Frase fue $FRASE",Snackbar.LENGTH_LONG).show()
        }
    }
}