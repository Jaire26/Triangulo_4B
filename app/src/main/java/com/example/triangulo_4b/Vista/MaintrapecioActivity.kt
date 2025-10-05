package com.example.triangulo_4b.Vista

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.triangulo_4b.Contrato.ContratoTrapecio
import com.example.triangulo_4b.Contrato.ContratoTriangulo
import com.example.triangulo_4b.Presentador.TrapecioPresentador
import com.example.triangulo_4b.Presentador.TrianguloPresentador
import com.example.triangulo_4b.R

class MaintrapecioActivity : AppCompatActivity(), ContratoTrapecio.Vista {

    //declaramos a txtrespara poder usarlo
    private lateinit var txvResTrap: TextView


    //declaramos el presentador que vamos a ocupar en la vista
    private lateinit var presentador: ContratoTrapecio.Presentador


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_maintrapecio)

        //inicializamos los componentes que vamos a utilizar
        val txtbaseMayor=findViewById<EditText>(R.id.editbaseMay)
        val txtbaseMenor=findViewById<EditText>(R.id.editbaseMenor)
        val txtaltura=findViewById<EditText>(R.id.editaltura)
        val txtl1trap=findViewById<EditText>(R.id.editl1)
        val txtl2Trap=findViewById<EditText>(R.id.editl2)
        val btnArea=findViewById<Button>(R.id.btnAreaTrap)
        val btnPerimetro=findViewById<Button>(R.id.btnPerimetroTrap)
        val btnTipo=findViewById<Button>(R.id.btnTipoTrap)
        val txvResTrap=findViewById<TextView>(R.id.txvResTr)

        //inicializamos al presentador
        presentador= TrapecioPresentador(this)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnPerimetro.setOnClickListener {
            val baseMay= txtbaseMayor.text.toString().toFloat()
            val baseMen=txtbaseMenor.text.toString().toFloat()
            val l1=txtl1trap.text.toString().toFloat()
            val l2=txtl2Trap.text.toString().toFloat()
            presentador.perimetroTrap(baseMay,baseMen,l1,l2)
        }

        btnArea.setOnClickListener {
            val baseMay= txtbaseMayor.text.toString().toFloat()
            val baseMen=txtbaseMenor.text.toString().toFloat()
            val h=txtaltura.text.toString().toFloat()
            presentador.areaTrap(baseMay,baseMen,h)
        }

        btnTipo.setOnClickListener {
            val l1=txtbaseMenor.text.toString().toFloat()
            val l2=txtbaseMenor.text.toString().toFloat()
            val altura=txtaltura.text.toString().toFloat()
            presentador.tipoTrap(l1,altura,lado1)
        }

    }

    override fun showAreaTrap(area: Float) {
        txvResTr.text="El area es : ${area}"

    }

    override fun showPerimetroTrap(perimetro: Float) {

    }

    override fun showTipoTrap(tipo: String) {

    }

    override fun showErrorTrap(msg: String) {

    }
}