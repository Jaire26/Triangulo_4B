package com.example.triangulo_4b.Presentador

import com.example.triangulo_4b.Contrato.ContratoRectangulo
import com.example.triangulo_4b.Contrato.ContratoTrapecio
import com.example.triangulo_4b.Contrato.ContratoTriangulo
import com.example.triangulo_4b.Modelo.RectanguloModelo
import com.example.triangulo_4b.Modelo.TrapecioModelo
import com.example.triangulo_4b.Modelo.TrianguloModelo

class TrapecioPresentador(private val vista: ContratoTrapecio.Vista): ContratoTrapecio.Presentador {

    private val modelo: ContratoTrapecio.Modelo= TrapecioModelo()

    override fun areaTrap(baseMayor: Float, baseMenor: Float, altura: Float, lado1: Float, lado2: Float) {

        if (modelo.validaTrap(baseMayor, baseMenor, altura, lado1, lado2)) {
            val t = modelo.tipoTrap(altura, lado1, lado2)
            vista.showTipoTrap(t)

        } else {
            vista.showErrorTrap("Datos no validos para el tipo de trapecio")
        }

    }

    override fun perimetroTrap(baseMayor: Float, baseMenor: Float, lado1: Float, lado2: Float, altura: Float) {
        if(modelo.validaTrap(baseMayor, baseMenor, altura, lado1, lado2)){

            val p = modelo.perimtroTrao(baseMayor, baseMenor, lado1, lado2)
            vista.showPerimetroTrap(p)

        } else {
            vista.showErrorTrap("Datos no validos para el perímetro")
        }

    }

    override fun tipoTrap(baseMayor: Float, baseMenor: Float, altura: Float, lado1: Float, lado2: Float) {
        if (modelo.validaTrap(baseMayor, baseMenor, altura, lado1, lado2)) {

            val t = modelo.tipoTrap(altura, lado1, lado2)
            vista.showTipoTrap(t)

        } else {
            vista.showErrorTrap("Datos no validos para el tipo de trapecio")
        }
    }
}
