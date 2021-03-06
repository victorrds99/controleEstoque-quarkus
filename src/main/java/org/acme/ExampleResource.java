package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Seja bem vindo cara!!";
    }
    
    @Path("/{nome}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String saldacoes(String nome) {
        return "Seja bem vindo "+ nome;
    }
}