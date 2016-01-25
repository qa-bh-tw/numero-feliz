package com.felicidade;

import static java.lang.Character.getNumericValue;

public class QuebradorDeNumero {

    public int[] quebraNumero(int numero) {
        if (numero <= 0 ){
           throw new IllegalArgumentException("Numero deve ser maior que zero");
        }

        String numeroEmString = String.valueOf(numero);
        int tamanhoVetor = numeroEmString.length();
        int[] resultado = new int[tamanhoVetor];

        for (int posicao = 0; posicao < tamanhoVetor; posicao++) {
            resultado[posicao] = getNumericValue(numeroEmString.charAt(posicao));
        }
        return resultado;
    }
}

