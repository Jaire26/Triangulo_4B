package com.example.triangulo_4b.Modelo

import com.example.triangulo_4b.Contrato.ContratoTrapecio

class TrapecioModelo: ContratoTrapecio.Modelo {

    override fun areaTrap(
        baseMayor: Float,
        baseMenor: Float,
        altura: Float,
        lado1: Float,
        lado2: Float
    ): Float {
        return ((baseMayor + baseMenor) / 2f) * altura
    }

    override fun perimtroTrao(baseMayor: Float, baseMenor: Float, lado1: Float, lado2: Float): Float {

        return baseMayor + baseMenor + lado1 + lado2
    }

    override fun tipoTrap(lado1: Float, lado2: Float, altura: Float): String {
        if((lado1==altura) || (lado2==altura))
            return "Trapecio Rectangulo"
        else if (lado1==lado2)
            return "Trapecio Isóceles"
        else
            return "Trapecio Escaleno"
    }

    override fun validaTrap(baseMayor: Float, baseMenor: Float, altura: Float, lado1: Float, lado2: Float): Boolean {
        if (baseMayor <= 0f || baseMenor <= 0f || altura <= 0f || lado1 <= 0f || lado2 <= 0f) {
            return false
        }
        if (baseMayor == baseMenor) {
            return false
        }
        return true
    }
}