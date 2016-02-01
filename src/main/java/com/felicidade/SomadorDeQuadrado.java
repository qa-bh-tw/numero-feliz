package com.felicidade;

import static java.lang.Math.pow;

public class SomadorDeQuadrado {

    QuebradorDeNumero quebradorDeNumero;

    public SomadorDeQuadrado(){
        quebradorDeNumero = new QuebradorDeNumero();
    }

    public Double transformaListaEmDouble(Double valor) {
        int[] resultadoQuebra = quebradorDeNumero.quebraNumero(valor.intValue());
        Double resultado = 0D;
        for (int i = 0; i < resultadoQuebra.length; i++) {
            resultado +=  pow(resultadoQuebra[i],2);
        }
        return resultado;
    }
}
