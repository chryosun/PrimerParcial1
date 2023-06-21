package com.example.primerparcial1

import android.app.Activity
import android.content.Intent
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
        // variable donde se declara un intent en blanco para ser utilizado para crear y enviar
        // los parametros por medio de un bundle
        val intentRetorno= Intent()
        intent.extras?.let { datosNombre ->
        nombre = datosNombre.getString("nombre")
        }
        texto.text="Bienvenido al sistema, $nombre!"
        boton.setOnClickListener {
            //Agregamos al intent por medio de la llace de mensaje el valor requerido
            intentRetorno.putExtra("mensaje","Datos registrados exitosamente")
            //Se establece que la actividad ha concluido exitosamente y se empaqueta
            // junto al intent
            setResult(Activity.RESULT_OK, intentRetorno)
            finish()
        }
    }
}