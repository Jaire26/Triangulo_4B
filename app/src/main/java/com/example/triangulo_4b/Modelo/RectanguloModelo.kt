package com.example.triangulo_4b.Modelo

import com.example.triangulo_4b.Contrato.ContratoRectangulo
import kotlin.math.sqrt

class RectanguloModelo: ContratoRectangulo.Modelo {


    override fun areaRec(base: Float, altura: Float): Float {

        return base * altura

    }

    override fun perimetroRec(base: Float, altura: Float): Float {
        return base + altura + base+ altura;

    }

    override fun tipoRec(base: Float, altura: Float): String {

        if (base == altura)
            return "Cuadrado";
        else
            return "Rectángulo";

    }

    override fun validaRec(base: Float, altura: Float): Boolean {
        if (base != altura)
            return true
        else
            return false

    }


}