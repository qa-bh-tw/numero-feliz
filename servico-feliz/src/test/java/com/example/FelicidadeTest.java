package com.example;

import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FelicidadeTest {

    private HttpServer server;
    private WebTarget target;

    @Before
    public void setUp() throws Exception {
        server = Main.startServer();
        Client c = ClientBuilder.newClient();
        target = c.target(Main.BASE_URI);
    }

    @After
    public void tearDown() throws Exception {
        server.stop();
    }

    @Test
    public void testGetResourceFelicidadeFor1() {
        String responseMsg = target.path("felicidade/1").request().get(String.class);
        assertThat(responseMsg, is ("true"));
    }

    @Test
    public void testGetResourceFelicidadeFor2() {
        String responseMsg = target.path("felicidade/2").request().get(String.class);
        assertThat(responseMsg, is ("false"));
    }

    @Test
    public void testGetResourceFelicidadeFor10(){
        String responseMsg = target.path("felicidade/10").request().get(String.class);
        assertThat(responseMsg, is ("true"));
    }

}
