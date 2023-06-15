package com.example.primerparcial1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    private var nombre: String?=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        Log.d("CiclodeVida","Se inicio onCreate de la segunda actividad")
        val boton=findViewById<Button>(R.id.regresar)
        val texto=findViewById<TextView>(R.id.campoNombre)
        intent.extras?.let { datosNombre ->
        nombre = datosNombre.getString("nombre")
        }
        texto.text="Bienvenido al sistema, $nombre!"
        boton.setOnClickListener { finish() }
    }
}