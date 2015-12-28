package com.felicidade;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class VerificadorDeNumeroFelizTest {

    @Test
    public void deveSerFelizParaUm(){
        VerificadorDeNumeroFeliz numeroFeliz = new VerificadorDeNumeroFeliz();
        boolean ehFeliz = numeroFeliz.verificaNumeroFeliz(1);
        assertTrue("1 deveria ser feliz", ehFeliz);
    }

    @Test
    public void deveSerFelizParaSete(){
        VerificadorDeNumeroFeliz numeroFeliz = new VerificadorDeNumeroFeliz();
        boolean ehFeliz = numeroFeliz.verificaNumeroFeliz(7);
        assertTrue("7 deveria ser feliz", ehFeliz);
    }

    @Test
    public void deveSerFelizParaDez(){
        VerificadorDeNumeroFeliz numeroFeliz = new VerificadorDeNumeroFeliz();
        boolean ehFeliz = numeroFeliz.verificaNumeroFeliz(10);
        assertTrue("10 deveria ser feliz", ehFeliz);
    }

    @Test
    public void deveSerFelizParaQuarentaENove(){
        VerificadorDeNumeroFeliz numeroFeliz = new VerificadorDeNumeroFeliz();
        boolean ehFeliz = numeroFeliz.verificaNumeroFeliz(49);
        assertTrue("49 deveria ser feliz", ehFeliz);
    }

    @Test
    public void deveSerInfelizParaDois(){
        VerificadorDeNumeroFeliz numeroFeliz = new VerificadorDeNumeroFeliz();
        boolean ehInfeliz = numeroFeliz.verificaNumeroFeliz(2);
        assertFalse("2 deveria ser infeliz", ehInfeliz);
    }

    @Test
    public void deveSerInfelizParaCentoEVinteECinco() {
        VerificadorDeNumeroFeliz numeroFeliz = new VerificadorDeNumeroFeliz();
        boolean ehInfeliz = numeroFeliz.verificaNumeroFeliz(125);
        assertFalse("125 deveria ser infeliz", ehInfeliz);
    }

    @Test
    public void deveSerFelizParaQuarentaENoveNegativo(){
        VerificadorDeNumeroFeliz numeroFeliz = new VerificadorDeNumeroFeliz();
        boolean ehFeliz = numeroFeliz.verificaNumeroFeliz(-49);
        assertThat(ehFeliz, is(false));
    }
}