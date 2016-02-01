package com.felicidade;

import java.util.LinkedHashSet;

import java.util.Set;

import static java.lang.Math.pow;

public class VerificadorDeNumeroFeliz {

    private final QuebradorDeNumero quebradorDeNumero;
    private final SomadorDeQuadrado somadorDeQuadrado;

    public VerificadorDeNumeroFeliz() {
        quebradorDeNumero = new QuebradorDeNumero();
        somadorDeQuadrado = new SomadorDeQuadrado();
    }

    public boolean verificaNumeroFeliz(int numero) {
        double candidato = numero;
        double valorSomado = 0;
        Set<Integer> candidatos = new LinkedHashSet<Integer>();
        candidatos.add(numero);

        if (numero <= 0) {
            return false;
        }

        do {
            valorSomado = somadorDeQuadrado.transformaListaEmDouble(candidato);

            if (!candidatos.add((int) valorSomado) && (valorSomado != 1)) {
                return false;
            }

            candidato = valorSomado;

        } while ((valorSomado != 1) && (valorSomado != numero));

        return true;
    }

}
