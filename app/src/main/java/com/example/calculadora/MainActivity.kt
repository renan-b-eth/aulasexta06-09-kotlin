package com.example.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var primeiroNumero:TextInputEditText = findViewById(R.id.editPrimeiroNumero)
        var segundoNumero:TextInputEditText = findViewById(R.id.editSegundoNumero)
        var btnSomar:Button = findViewById(R.id.btnSomar)
        var txtResultado:TextView = findViewById(R.id.txtResultado)

        btnSomar.setOnClickListener{
            println(primeiroNumero)
            var resultado = primeiroNumero.text.toString().toDouble() + segundoNumero.text.toString().toDouble()
            txtResultado.setText("Resultado da soma: ${resultado}")
        }

    }
}