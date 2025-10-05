package com.example.triangulo_4b.Vista

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.triangulo_4b.Contrato.ContratoCirculo
import com.example.triangulo_4b.Contrato.ContratoRectangulo
import com.example.triangulo_4b.Presentador.CirculoPresentador
import com.example.triangulo_4b.Presentador.RectanguloPresentador
import com.example.triangulo_4b.R

class MaincirculoActivity : AppCompatActivity(), ContratoCirculo.Vista {

    //declaramos a txtrespara poder usarlo
    private lateinit var txvResCir: TextView
    //declaramos el presentador que vamos a ocupar en la vista
    private lateinit var presentador: ContratoCirculo.Presentador


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_maincirculo)
        //inicializamos los componentes que vamos a utilizar
        val txtradio = findViewById<EditText>(R.id.editradio)
        val btnArea = findViewById<Button>(R.id.btnArea)
        val btnPerimetro = findViewById<Button>(R.id.btnCircunferencia)
        val txvResCir = findViewById<TextView>(R.id.txvResCir)

        //inicializamos al presentador
        presentador = CirculoPresentador(this)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnPerimetro.setOnClickListener {
            val radio = txtradio.text.toString().toFloat()
            presentador.circunferencia(radio)
        }

        btnArea.setOnClickListener {
            val radio = txtradio.text.toString().toFloat()
            presentador.areaCir(radio)
        }

    }

    override fun showAreaCir(area: Float) {
        txvResCir.text="El area es : ${area}"
    }

    override fun showCicunferencia(perimetro: Float) {
        txvResCir.text="La circunferencia total es : ${perimetro}"
    }

    override fun showErrorCir(msg: String) {
        txvResCir.text=msg
    }
}