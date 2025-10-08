package com.example.triangulo_4b.Presentador

import com.example.triangulo_4b.Contrato.ContratoRectangulo
import com.example.triangulo_4b.Modelo.RectanguloModelo

class RectanguloPresentador (private val vista: ContratoRectangulo.Vista): ContratoRectangulo.Presentador {

    private val modelo: ContratoRectangulo.Modelo= RectanguloModelo()
    override fun areaRec(base: Float, altura: Float) {

        if(modelo.validaRec(base,altura)==true){
            val a=modelo.areaRec(base,altura)
            vista.showAreaRec(a)
        }else
            vista.showErrorRec("Datos no validos")

    }

    override fun perimetroRec(base: Float, altura: Float) {
        if(modelo.validaRec(base,altura)){
            val p=modelo.perimetroRec(base,altura)
            vista.showPerimetroRec(p)
        }else{
            vista.showErrorRec("Datos no validos")
        }
    }

    override fun tipoRec(base: Float, altura: Float) {
        if(modelo.validaRec(base,altura)==true){
            val t=modelo.tipoRec(base,altura )
            vista.showTipoRec(t)
        }else{
            vista.showErrorRec("Es un cuadrado, no podemos calcularlo")
        }
    }


}