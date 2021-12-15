package org.acme.curriculo.controller;

import io.smallrye.mutiny.Uni;
import org.acme.curriculo.Curriculo;
import org.acme.curriculo.Experiencia;
import org.acme.curriculo.Formacao;
import org.acme.curriculo.Usuario_Curriculo;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/curriculos")
@ApplicationScoped
public class CurriculoController {



    @GET
    public Uni<List<Curriculo>> findAll() {
        return Curriculo.listAll();
    }

    @GET
    @Path("/{id}")
    public Uni<Curriculo> getById(Long id) {
        return Curriculo.findById(id);
    }

    @POST
    @Transactional
    public Response criarUsuario(Usuario_Curriculo model) {
       titularCurriculo.persist();
       return Response.ok( model).build();
    }

    @POST
    @Transactional
    public Response adicionarFormacao(@PathParam("id") int id, Formacao formacao) {
        Usuario_Curriculo  titular = (Usuario_Curriculo) Usuario_Curriculo.findById(id);
        formacao.persist();
        titular.addFormacoes(formacao);

        return Response.ok(titular).build();
    }

    @POST
    @Transactional
    public Response adicionarExperiencia(@PathParam("id") int id, Experiencia experiencia) {
        Usuario_Curriculo  titular = (Usuario_Curriculo) Usuario_Curriculo.findById(id);
        experienci.persist();
        titular.addExperiencias(experiencia);
        return Response.ok(titular).build();
    }

    @POST
    @Transactional
    public Response finalizarCurriculo(@PathParam("id") int id) {
        Usuario_Curriculo  titular = (TUsuario_Curriculo) Usuario_Curriculo.findById(id);
        Curriculo curriculo = new Curriculo(titular);
        curriculo.persist();
        return Response.ok(titular).build();
    }

    @DELETE
    public void deleteById(@PathParam("id") int id){
        Curriculo.deleteById(id);
    }
}
