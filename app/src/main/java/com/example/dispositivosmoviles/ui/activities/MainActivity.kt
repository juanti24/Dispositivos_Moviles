package com.example.dispositivosmoviles.ui.activities

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.dispositivosmoviles.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

//clase que hereda de AppCompatActivity usando :
class MainActivity : AppCompatActivity() {

    // private Modificafor privado
    // lateinit que especifica que la variale se va a inicializar luego
    // var para cambiar en el tiempo
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        //onCreate hace que la clase que esta dentro en un objeto
        super.onCreate(savedInstanceState)
        Log.d("UCE","Entrando a Create")
        //Binding
        // layoutInflater inflar el layout asociado
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()

//        intent.extras.let {
//          it.toString()
//        }

        Log.d("UCE","Entrando a Start")
        initClass()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    private fun initClass() {
        binding.button.setOnClickListener {
            //binding.txtBuscar.text = "El codigo ejecuta correctamente"

            //SUMA

            //Toast.makeText(this, "Este es un ejemplo", Toast.LENGTH_SHORT).show()

//            var f = Snackbar.make(
//                binding.button,
//                "Este es otro mensaje",
//                Snackbar.LENGTH_SHORT
//            )
//            f.show()

            var intent = Intent(
                this,
                SecondActivity::class.java
            )

            intent.putExtra("var1", binding.txtBuscar.text.toString())
            startActivity(intent)
        }

    }

}