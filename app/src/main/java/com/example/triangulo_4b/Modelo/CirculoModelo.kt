package com.example.triangulo_4b.Modelo

import com.example.triangulo_4b.Contrato.ContratoCirculo
import kotlin.math.PI

class CirculoModelo: ContratoCirculo.Modelo {
    override fun areaCir(radio: Float): Float {

        return PI.toFloat() * radio * radio;
    }

    override fun Circunferencia(radio: Float): Float {
        return 2f * PI.toFloat() * radio;

    }

    override fun validaCir(radio: Float): Boolean {
        if (radio>0f)
            return true
        else
            return false
    }
}