package com.example.triangulo_4b.Vista

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.triangulo_4b.Contrato.ContratoRectangulo
import com.example.triangulo_4b.Presentador.RectanguloPresentador
import com.example.triangulo_4b.R

class RectanguloActivity : AppCompatActivity(), ContratoRectangulo.Vista {

    //declaramos a txtrespara poder usarlo
    private lateinit var txvRes: TextView
    //declaramos el presentador que vamos a ocupar en la vista
    private lateinit var presentador: ContratoRectangulo.Presentador


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rectangulo)

        //inicializamos los componentes que vamos a utilizar
        val txtbase=findViewById<EditText>(R.id.edbase)
        val txtaltura=findViewById<EditText>(R.id.edaltura)
        val btnArea=findViewById<Button>(R.id.btnArea)
        val btnPerimetro=findViewById<Button>(R.id.btnPerimetro)
        val btnTipo=findViewById<Button>(R.id.btnTipo)
        val txvResRec=findViewById<TextView>(R.id.txvResRec)

        //inicializamos al presentador
        presentador= RectanguloPresentador(this)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnPerimetro.setOnClickListener {
            val base= txtbase.text.toString().toFloat()
            val altura=txtaltura.text.toString().toFloat()
            presentador.perimetroRec(base,altura)
        }

        btnArea.setOnClickListener {
            val base=txtbase.text.toString().toFloat()
            val altura=txtaltura.text.toString().toFloat()
            presentador.areaRec(base,altura)
        }

        btnTipo.setOnClickListener {
            val base= txtbase.text.toString().toFloat()
            val altura=txtaltura.text.toString().toFloat()
            presentador.tipoRec(base,altura)
        }
    }
    override fun showAreaRec(area: Float) {
        txvRes.text="El area es : ${area}"
    }

    override fun showPerimetroRec(perimetro: Float) {
        txvRes.text="El perimetro es : ${perimetro}"
    }

    override fun showTipoRec(tipo: String) {
        txvRes.text = "El tipo de figura es : ${tipo}"
    }


    override fun showErrorRec(msg: String) {

      txvRes.text=msg
    }
}