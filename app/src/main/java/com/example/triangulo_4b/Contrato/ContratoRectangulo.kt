package com.example.triangulo_4b.Contrato

interface ContratoRectangulo {

    interface Modelo{
        fun areaRec(base: Float,altura: Float): Float
        fun perimetroRec(base: Float,altura: Float): Float
        fun tipoRec(base: Float,altura: Float): String
        fun validaRec(base: Float,altura: Float): Boolean
    }

    interface Vista{

        fun showAreaRec(area:Float)
        fun showPerimetroRec(perimetro: Float)
        fun showTipoRec(tipo: String)
        fun showErrorRec(msg: String)
    }

    interface Presentador{
        fun areaRec(base: Float,altura: Float)
        fun perimetroRec(base: Float,altura: Float)
        fun tipoRec(base: Float,altura: Float)
    }

}