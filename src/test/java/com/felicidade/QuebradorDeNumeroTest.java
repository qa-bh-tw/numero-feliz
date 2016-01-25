package com.felicidade;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class QuebradorDeNumeroTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private QuebradorDeNumero quebradorDeNumero;

    @Before
    public void setUp() {
        quebradorDeNumero = new QuebradorDeNumero();
    }

    @Test
    public void verificaQuebraDe10(){
        int arrayRetorno[] = quebradorDeNumero.quebraNumero(10);

        assertEquals(1, arrayRetorno[0]);
        assertEquals(0, arrayRetorno[1]);
    }

    @Test
    public void verificaQuebraDe10Negativo(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Numero deve ser maior que nove");

        quebradorDeNumero.quebraNumero(-10);
    }

    @Test
    public void verificaQuebraDeNumerosMenorQueDez() {

        int arrayRetorno[] = quebradorDeNumero.quebraNumero(8);

        assertEquals(8, arrayRetorno[0]);

    }

    @Test
    public void verificaQuebraDe11(){
        int arrayRetorno[] = quebradorDeNumero.quebraNumero(11);

        assertEquals(1, arrayRetorno[0]);
        assertEquals(1, arrayRetorno[1]);
    }

    @Test
    public void verificaTamanhoVetorNumerosCalculados(){
        int arrayRetorno[] = quebradorDeNumero.quebraNumero(11);

        assertEquals(2, arrayRetorno.length);
    }

}