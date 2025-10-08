package com.example.triangulo_4b.Vista

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.triangulo_4b.R

class MainfigurasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mainfiguras)

        val spinner=findViewById<Spinner>(R.id.spnopcion)
        val boton= findViewById<Button>(R.id.btnIr)
        val opciones= arrayOf("Triangulo","Rectangulo","Circulo","Trapecio")
        val adaptador= ArrayAdapter<String>(
            this,
            androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
            opciones)
        spinner.adapter=adaptador;

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        boton.setOnClickListener {
            when(spinner.selectedItem.toString()){
                "Triangulo"->{
                    val intent= Intent(this, MainActivity::class.java )
                    startActivity(intent)

                }
                "Rectangulo"->{
                    val intent= Intent(this, RectanguloActivity::class.java)
                    startActivity(intent)


                }
                "Circulo"->{
                    val intent= Intent(this, MaincirculoActivity::class.java)
                    startActivity(intent)


                }
                "Trapecio"->{
                    val intent= Intent(this, MaintrapecioActivity::class.java)
                    startActivity(intent)


                }
            }

        }
    }
}