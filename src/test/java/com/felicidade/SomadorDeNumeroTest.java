package com.felicidade;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SomadorDeNumeroTest {

    @Test
    public void verficaSomaDeUm(){
        Double numero = 1D;

        SomadorDeNumero somadorDeNumero = new SomadorDeNumero();
        Double numeroSomado = somadorDeNumero.soma(numero);

        assertThat(1D, is(numeroSomado));
    }

    @Test
    public void verficaSomaDoNumeroDois(){
        Double numero = 2D;

        SomadorDeNumero somadorDeNumero = new SomadorDeNumero();
        Double numeroSomado = somadorDeNumero.soma(numero);

        assertThat(4D, is(numeroSomado));
    }

}
