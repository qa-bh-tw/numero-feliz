package com.felicidade;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SomadorDeNumeroTest {

    @Test
    public void verficaSomaDeUm(){
        Double numero = 1D;

        SomadorDeQuadrado somadorDeQuadrado = new SomadorDeQuadrado();
        Double numeroSomado = somadorDeQuadrado.transformaListaEmDouble(numero);

        assertThat(1D, is(numeroSomado));
    }

    @Test
    public void verficaSomaDoNumeroDois(){
        Double numero = 2D;

        SomadorDeQuadrado somadorDeQuadrado = new SomadorDeQuadrado();
        Double numeroSomado = somadorDeQuadrado.transformaListaEmDouble(numero);

        assertThat(4D, is(numeroSomado));
    }

    @Test
    public void verificaListaDeNumeros(){
        Double valor = 12D;
        SomadorDeQuadrado somadorDeQuadrado = new SomadorDeQuadrado();
        Double resultado = somadorDeQuadrado.transformaListaEmDouble(valor);

        assertThat(resultado, is(5D));
    }

    @Test
    public void verificaListaComTresNumeros(){
        Double valor = 121D;
        SomadorDeQuadrado somadorDeQuadrado = new SomadorDeQuadrado();
        Double resultado = somadorDeQuadrado.transformaListaEmDouble(valor);

        assertThat(resultado, is(6D));
    }

}
