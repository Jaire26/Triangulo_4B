package com.example.triangulo_4b.Contrato

interface ContratoCirculo {

    interface Modelo{
        fun areaCir(radio: Float): Float
        fun Circunferencia(radio: Float): Float
        fun validaCir(radio:Float): Boolean

    }

    interface Vista{

        fun showAreaCir(area: Float)
        fun showCicunferencia(perimetro: Float)
        fun showErrorCir(msg: String)
    }

    interface Presentador{
        fun areaCir(radio: Float)
        fun circunferencia(radio: Float)
    }
}