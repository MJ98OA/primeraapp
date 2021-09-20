package com.example.miprimeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //comentario 2

        Log.v("MainActivity", "Se ha creado un texto corrctamente")
        Toast.makeText(this,"Hola",Toast.LENGTH_LONG).show()




    }
}


































