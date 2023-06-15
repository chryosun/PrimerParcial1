package com.example.primerparcial1
// Roque Virgilio Castillo Diaz 0101200203098
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.interfazprueba)
        Log.d("Ciclo de Vida","Se inicio onCreate")
        // Variables en Kotlin
        // var / val / const
        //var Cuando se espera que el valor es mutable
        //var a=55
        //var b=a+45
        //a=100

        //val Cuando se espera que el valor sea inmutable

        val label= findViewById<TextView>(R.id.txtInicio)
        btn=findViewById<Button>(R.id.btn_capturar)
        val nombre=findViewById<EditText>(R.id.inputNombre)

        btn.setOnClickListener {
            val capturado= nombre.text.toString().trim()
            if(capturado.isNotEmpty()){
                label.text=capturado
                println("El nombre de capturado es de $capturado")

                //Mensaje usando log
                Log.d("capturas","El nombre capturado es $capturado")

            }
            else{
                //se esta invocando la funcion mostrarSnackbar
                mostrarSnackbar("Se requiere que ingrese su nombre...")
            }
        }

    }

    private fun mostrarSnackbar(mensaje: String){
        Snackbar.make(btn,mensaje,Snackbar.LENGTH_SHORT).show()
    }

    override fun onStart(){
        super.onStart()
        Log.d("Ciclo de Vida","Se inicio onStart")
    }
    override fun onResume(){
        super.onResume()
        Log.d("Ciclo de Vida","Se inicio onResume")
    }
    override fun onPause(){
        super.onPause()
        Log.d("Ciclo de Vida","Se inicio onPause")
    }
    override fun onStop(){
        super.onStop()
        Log.d("Ciclo de Vida","Se inicio onStop")
    }
    override fun onRestart(){
        super.onRestart()
        Log.d("Ciclo de Vida","Se inicio onRestart")
    }
    override fun onDestroy(){
        super.onDestroy()
        Log.d("Ciclo de Vida","Se inicio onDestroy")
    }
}