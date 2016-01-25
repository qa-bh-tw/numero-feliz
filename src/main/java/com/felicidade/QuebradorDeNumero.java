package com.felicidade;

public class QuebradorDeNumero {

    public int[] quebraNumero(int numero) {
        if (numero <= 0 ){
           throw new IllegalArgumentException("Numero deve ser maior que nove");
        }
        int tamanhoVetor = String.valueOf(numero).length();
        int[] resultado = new int[tamanhoVetor];
        String valorString = String.valueOf(numero);
        int i = valorString.length();
        for (int j = 0; j < i; j++) {
            resultado[j] = Integer.parseInt(valorString.substring(j, j + 1));
        }
        return resultado;
    }
}

