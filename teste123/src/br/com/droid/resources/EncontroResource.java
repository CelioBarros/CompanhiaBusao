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
	// SELECIONAR

	@GET
	@Path("/buscarTodos")
	@Produces("application/json")
	public ArrayList<Encontro> selTodos() throws SQLException {
		return Banco.getBancoInstance().getListaEncontros();
	}

	@GET
	@Path("/buscarTodosGSON")
	@Produces("application/json")
	public String selTodosGSON() throws SQLException {
		return new Gson().toJson(Banco.getBancoInstance().getListaEncontros());
	}

	@GET
	@Path("/getMeusEncontros/{id}")
	@Produces("application/json")
	public String getMeusEncontros(@PathParam("id") String idUsuario) {
		return new Gson().toJson(Banco.getBancoInstance().getMeusEncontros(
				idUsuario));

	}

	@GET
	@Path("/getPerfisConfirmados/{id}")
	@Produces("application/json")
	public String getPerfisConfirmados(@PathParam("id") int idEncontro) {
		return new Gson().toJson(Banco.getBancoInstance().getPerfisConfirmados(
				idEncontro));
	}

	@GET
	@Path("/getPerfisChegaram/{id}")
	@Produces("application/json")
	public String getPerfisChegaram(@PathParam("id") int idEncontro) {
		return new Gson().toJson(Banco.getBancoInstance().getPerfisChegaram(
				idEncontro));
	}

	@GET
	@Path("/getEncontrosNaoParticipo/{id}")
	@Produces("application/json")
	public String getEncontrosNaoParticipo(@PathParam("id") String idUsuario) {
		return new Gson().toJson(Banco.getBancoInstance()
				.getEncontrosNaoParticipo(idUsuario));

	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Encontro getEncontro(@PathParam("id") int id) {
		Encontro encontro = Banco.getBancoInstance().buscar(id);

		if (encontro == null)
			throw new NoContentException("Cliente não encontrado!");

		return encontro;
	}

	// DELETE
	@GET
	@Path("/delete/{id}")
	@Produces("application/json")
	public String deleteEncontro(@PathParam("id") int id) throws SQLException {
		return Banco.getBancoInstance().delete(id);
	}

	@GET
	@Path("/desconfirmar/{id}/{nome}")
	@Produces("application/json")
	public String desconfirmarPresenca(@PathParam("id") int idEncontro,
			@PathParam("nome") String idUsuario) throws SQLException {
		return Banco.getBancoInstance().desconfirmarPresenca(idEncontro,
				idUsuario);
	}

	// INSERT
	/**
	 * Insere na lista de confirmados
	 * 
	 * @param id
	 *            Id do encontro
	 * @param nome
	 *            Id Dono do encontro
	 * @return
	 * @throws SQLException
	 */
	@GET
	@Path("/confirma/{id}/{nome}")
	@Produces("application/json")
	public String confirmaPresenca(@PathParam("id") int id,
			@PathParam("nome") String idUsuario) throws SQLException {
		return Banco.getBancoInstance().confirmaPresenca(id, idUsuario);
	}

	/**
	 * Confirma que u
	 * 
	 * @param id
	 *            Id Do Encontro
	 * @param idDono
	 *            Id Do Dono do Encontro
	 * @return
	 * @throws SQLException
	 */
	@GET
	@Path("/cheguei/{id}/{nome}")
	@Produces("application/json")
	public String confirmaQueChegou(@PathParam("id") int id,
			@PathParam("nome") String idDono) throws SQLException {
		return Banco.getBancoInstance().confirmaQueChegou(id, idDono);
	}

	/**
	 * Cria Usuario;
	 * 
	 * @param id
	 *            Id do Usuario
	 * @param nome
	 *            Nome do Usuario
	 * @return
	 * @throws SQLException
	 */
	@GET
	@Path("/criarusuario/{id}/{nome}")
	@Produces("application/json")
	public String criarUsuario(@PathParam("id") String id,
			@PathParam("nome") String nome) throws SQLException {
		return Banco.getBancoInstance().criarUsuario(id, nome);
	}

	/**
	 * Insere um encontro;
	 * 
	 * @param encontro
	 *            Encontro
	 * @return
	 * @throws SQLException
	 */
	@POST
	@Path("/inserir")
	@Produces("application/json")
	@Consumes("application/json")
	public String inserirEncontro(Encontro encontro) throws SQLException {
		
		return Banco.getBancoInstance().inserir(encontro);
	}

}
