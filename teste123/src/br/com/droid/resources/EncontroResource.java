package br.com.droid.resources;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import br.com.droid.Banco;
import br.com.droid.exception.NoContentException;
import br.com.droid.model.Encontro;

@Path("/cliente")
public class EncontroResource {
    
    @GET
    @Path("/buscarTodos")
    @Produces("application/json")
    public ArrayList<Encontro> selTodos() throws SQLException{
     return Banco.getBancoInstance().getListaEncontros();
    }

    @GET
    @Path("/buscarTodosGSON")
    @Produces("application/json")
    public String selTodosGSON() throws SQLException{
     return new Gson().toJson(Banco.getBancoInstance().getListaEncontros());
    }
    
    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Encontro getEncontro(@PathParam("id") int id){
     Encontro encontro = Banco.getBancoInstance().buscar(id);
     
     if(encontro == null)
         throw new NoContentException("Cliente não encontrado!");
     
     return encontro;
    }
    
    @GET
    @Path("/delete/{id}")
    @Produces("application/json")
    public String deleteEncontro(@PathParam("id") int id) throws SQLException{
     return Banco.getBancoInstance().delete(id);
    }
    
    @GET
    @Path("/confirma/{id}/{nome}")
    @Produces("application/json")
    public String confirmaPresenca(@PathParam("id") int id,@PathParam("nome") String nome){
     return Banco.getBancoInstance().confirmaPresenca(id, nome);
    }
    
    @GET
    @Path("/desconfirmar/{id}/{nome}")
    @Produces("application/json")
    public String desconfirmarPresenca(@PathParam("id") int id,@PathParam("nome") String nome){
     return Banco.getBancoInstance().desconfirmarPresenca(id, nome);
    }
    
    @GET
    @Path("/cheguei/{id}/{nome}")
    @Produces("application/json")
    public String confirmaQueChegou(@PathParam("id") int id,@PathParam("nome") String nome){
     return Banco.getBancoInstance().confirmaQueChegou(id, nome);
    }
    
    @GET
    @Path("/criarusuario/{id}/{nome}")
    @Produces("application/json")
    public String criarUsuario(@PathParam("id") String id,@PathParam("nome") String nome)throws SQLException{
     return Banco.getBancoInstance().criarUsuario(id, nome);
    }
    
    
    @POST
    @Path("/inserir")
    @Produces("application/json")
    @Consumes("application/json")
    public String inserirEncontro(Encontro encontro) throws SQLException {
     return Banco.getBancoInstance().inserir(encontro);
    }
    
}
 
