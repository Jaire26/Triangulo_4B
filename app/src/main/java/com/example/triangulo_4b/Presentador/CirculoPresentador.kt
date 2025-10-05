package com.example.triangulo_4b.Presentador

import com.example.triangulo_4b.Contrato.ContratoCirculo
import com.example.triangulo_4b.Contrato.ContratoRectangulo
import com.example.triangulo_4b.Modelo.CirculoModelo
import com.example.triangulo_4b.Modelo.RectanguloModelo

class CirculoPresentador(private val vista: ContratoCirculo.Vista): ContratoCirculo.Presentador {

    private val modelo: ContratoCirculo.Modelo= CirculoModelo()
    override fun areaCir(radio: Float) {

        if(modelo.validaCir(radio)==true){
            val a=modelo.areaCir(radio)
            vista.showAreaCir(a)
        }else
            vista.showErrorCir("Datos no validos")

    }

    override fun circunferencia(radio: Float) {

        if(modelo.validaCir(radio)){
            val p=modelo.Circunferencia(radio)
            vista.showCicunferencia(p)
        }else{
            vista.showErrorCir("Datos no validos")
        }

    }

}