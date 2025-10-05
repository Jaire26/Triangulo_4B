package com.example.triangulo_4b.Contrato

interface ContratoTrapecio {


    interface Modelo{

        fun areaTrap(baseMayor: Float, baseMenor: Float, altura: Float, lado1: Float, lado2: Float): Float;
        fun perimtroTrao(baseMayor: Float, baseMenor: Float, lado1: Float, lado2: Float):Float
        fun tipoTrap(lado1: Float, lado2: Float,altura:Float): String

        fun validaTrap(baseMayor: Float, baseMenor: Float, altura: Float, lado1: Float, lado2: Float): Boolean

    }

    interface Vista{

        fun showAreaTrap(area: Float)

        fun showPerimetroTrap(perimetro: Float)

        fun showTipoTrap(tipo: String)

        fun showErrorTrap(msg: String)
    }

    interface Presentador {

        fun areaTrap(baseMayor: Float, baseMenor: Float, altura: Float, lado1: Float, lado2: Float)

        fun perimetroTrap(baseMayor: Float, baseMenor: Float, lado1: Float, lado2: Float, altura: Float)

        fun tipoTrap(baseMayor: Float, baseMenor: Float, altura: Float, lado1: Float, lado2: Float)

    }


}