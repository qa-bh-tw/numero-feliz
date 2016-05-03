package com.example;

import com.felicidade.VerificadorDeNumeroFeliz;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("felicidade/{numero}")
public class Felicidade {

    private final VerificadorDeNumeroFeliz numeroFeliz;

    public Felicidade() {
        numeroFeliz = new VerificadorDeNumeroFeliz();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getFelicidade(@PathParam("numero") int numero) {
        return String.valueOf(numeroFeliz.verificaNumeroFeliz(numero));
    }
}
