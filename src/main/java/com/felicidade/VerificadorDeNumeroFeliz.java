package com.felicidade;

import java.util.LinkedHashSet;

import java.util.Set;

import static java.lang.Math.pow;

public class VerificadorDeNumeroFeliz {

    private final QuebradorDeNumero quebradorDeNumero = new QuebradorDeNumero();

    public boolean verificaNumeroFeliz(int numero) {
        double candidato = numero;
        double valorSomado = 0;
        Set<Integer> candidatos = new LinkedHashSet<Integer>();
        candidatos.add(numero);

        do {
            valorSomado = somaValores(candidato);

            if (!candidatos.add((int) valorSomado) && (valorSomado != 1)) {
                return false;
            }

            candidato= valorSomado;

        } while ((valorSomado != 1) && (valorSomado != numero));

        return true;
    }

    private double somaValores(double quadrado) {
        Double d = new Double(quadrado);

        int valorArray[] = quebradorDeNumero.quebraNumero(d.intValue());

        double somaValores = 0;

        for (int i = 0; i < valorArray.length; i++) {
            somaValores += pow(valorArray[i], 2);
        }
        return somaValores;
    }


    public int[] quebraNumero(int numero) {

        return quebradorDeNumero.quebraNumero(numero);
    }

}
