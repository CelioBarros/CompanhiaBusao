package br.com.droid.resources;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.sql.rowset.serial.SerialBlob;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import br.com.droid.Banco;
import br.com.droid.ConnectionMySQL;
import br.com.droid.Content;
import br.com.droid.DataDoEncontro;
import br.com.droid.HorarioDoEncontro;
import br.com.droid.POST2GCM;
import br.com.droid.exception.NoContentException;
import br.com.droid.model.Encontro;
import br.com.droid.model.Usuario;

@Path("/cliente")
public class EncontroResource {
	// SELECIONAR

	@GET
	@Path("/buscarTodos")
	@Produces("application/json")
	public ArrayList<Encontro> selTodos() throws SQLException {
		Connection c;
		String query = null;
		try {
			c = ConnectionMySQL.connectToDatabase();

			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = new Date();

			String queryDelete= "DELETE FROM encontro WHERE data_encontro < " + "'"+dateFormat.format(date)+"'";
			Statement statementDelete = c.createStatement();
			statementDelete.executeUpdate(queryDelete);

			statementDelete.close();	

			query = "SELECT * FROM encontro ORDER BY data_encontro";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return getAuxEncontros(query);
	}

	@GET
	@Path("/buscarTodosGSON")
	@Produces("application/json")
	public String selTodosGSON() throws SQLException {
		Connection c;
		String query = null;
		try {
			c = ConnectionMySQL.connectToDatabase();

			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = new Date();

			String queryDelete= "DELETE FROM encontro WHERE data_encontro < " + "'"+dateFormat.format(date)+"'";
			Statement statementDelete = c.createStatement();
			statementDelete.executeUpdate(queryDelete);

			statementDelete.close();	

			query = "SELECT * FROM encontro ORDER BY data_encontro";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Gson().toJson(getAuxEncontros(query));
	}

	@GET
	@Path("/getMeusEncontros/{id}")
	@Produces("application/json")
	public String getMeusEncontros(@PathParam("id") String idUsuario) {
		String query = null;
		Connection c;
		try {
			c = ConnectionMySQL.connectToDatabase();

			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = new Date();

			String queryDelete= "DELETE FROM encontro WHERE data_encontro < " + "'"+dateFormat.format(date)+"'";
			Statement statementDelete = c.createStatement();
			statementDelete.executeUpdate(queryDelete);

			statementDelete.close();	

			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery("SELECT count(*) FROM perfisconfirmados");
			rs.next();
			if(rs.getInt(1) == 0){
				query = "SELECT * FROM encontro WHERE id_dono="+idUsuario;
			}else{
				query = "SELECT DISTINCT e.* FROM encontro e, perfisconfirmados pc WHERE e.id_dono="+idUsuario +" or (pc.id_encontro=e.id and pc.id_usuario="+idUsuario+") ORDER BY e.data_encontro";
			}
			rs.close();
			st.close();



		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new Gson().toJson(getAuxEncontros(query));

	}

	@GET
	@Path("/getPerfisConfirmados/{id}")
	@Produces("application/json")
	public String getPerfisConfirmados(@PathParam("id") int idEncontro) {
		ArrayList<String> nomes = new ArrayList<String>();
		String query = "select u.nome from usuario u, perfisconfirmados pc where pc.id_usuario = u.id and pc.id_encontro=" + idEncontro;
		Connection c;
		try {
			c = ConnectionMySQL.connectToDatabase();
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next())
			{
				nomes.add(rs.getString(1));
			}

			rs.close();
			st.close();
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new Gson().toJson(nomes);
	}

	@GET
	@Path("/getPerfisChegaram/{id}")
	@Produces("application/json")
	public String getPerfisChegaram(@PathParam("id") int idEncontro) {
		ArrayList<String> nomes = new ArrayList<String>();
		String query = "select u.nome from usuario u, perfischegaram pc, perfisconfirmados pco where pc.id_usuario = u.id and pco.id_usuario = u.id and pc.id_encontro=" + idEncontro  + " and pco.id_encontro=" + idEncontro;
		Connection c;
		try {
			c = ConnectionMySQL.connectToDatabase();
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next())
			{
				nomes.add(rs.getString(1));
			}

			rs.close();
			st.close();
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new Gson().toJson(nomes);
	}
	
	@GET
	@Path("/getPerfisNaoChegaram/{id}")
	@Produces("application/json")
	public String getPerfisNaoChegaram(@PathParam("id") int idEncontro) {
		ArrayList<String> nomes = new ArrayList<String>();
		String query = "select u.nome from usuario u, perfisconfirmados pc where pc.id_encontro="+idEncontro+" and pc.id_usuario=u.id and pc.id_usuario not in (select u.id from usuario u, perfischegaram pch where pch.id_usuario = u.id and pch.id_encontro="+idEncontro+")";
		Connection c;
		try {
			c = ConnectionMySQL.connectToDatabase();
			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next())
			{
				nomes.add(rs.getString(1));
			}

			rs.close();
			st.close();
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new Gson().toJson(nomes);
	}

	@GET
	@Path("/getEncontrosNaoParticipo/{id}")
	@Produces("application/json")
	public String getEncontrosNaoParticipo(@PathParam("id") String idUsuario) {
		String query = null;
		Connection c;
		try {
			c = ConnectionMySQL.connectToDatabase();

			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = new Date();

			String queryDelete= "DELETE FROM encontro WHERE data_encontro < " + "'"+dateFormat.format(date)+"'";
			Statement statementDelete = c.createStatement();
			statementDelete.executeUpdate(queryDelete);

			statementDelete.close();	

			c = ConnectionMySQL.connectToDatabase();

			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery("SELECT count(*) FROM perfisconfirmados");
			rs.next();
			if(rs.getInt(1) == 0){
				query = "SELECT * FROM encontro WHERE id_dono!="+idUsuario;
			}else{
				query = "SELECT DISTINCT e.* FROM encontro e WHERE "+idUsuario +" not in (SELECT pc.id_usuario FROM perfisconfirmados pc WHERE pc.id_encontro=e.id) and e.id_dono !="+idUsuario +" ORDER BY e.data_encontro";
			}
			rs.close();
			st.close();


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new Gson().toJson(getAuxEncontros(query));

	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Encontro getEncontro(@PathParam("id") int id) {
		//Encontro encontro = Banco.getBancoInstance().buscar(id);
		Encontro encontro = null;
		if (encontro == null)
			throw new NoContentException("Cliente não encontrado!");

		return null;
	}

	// DELETE
	@GET
	@Path("/delete/{id}")
	@Produces("application/json")
	public String deleteEncontro(@PathParam("id") int id) throws SQLException {
		Connection c = ConnectionMySQL.connectToDatabase();
		String queryInserir = "DELETE FROM encontro WHERE id="+ id;
		PreparedStatement p = c.prepareStatement(queryInserir);
		p.execute();
		p.close();
		c.close();
		return "Encontro removido com sucesso!";
	}

	@GET
	@Path("/desconfirmar/{id}/{nome}")
	@Produces("application/json")
	public String desconfirmarPresenca(@PathParam("id") int idEncontro,
			@PathParam("nome") String idUsuario) throws SQLException {
		Connection c = ConnectionMySQL.connectToDatabase();
		String queryInserir = "DELETE FROM perfisconfirmados WHERE id_encontro= ? and id_usuario=?";
		PreparedStatement p = c.prepareStatement(queryInserir);
		p.setInt(1,idEncontro);
		p.setString(2, idUsuario);
		p.execute();
		return "Perfil desconfirmado com Sucesso";
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
		Connection c = ConnectionMySQL.connectToDatabase();
		String queryInserir = "INSERT INTO perfisconfirmados VALUES(?,?)";
		PreparedStatement p = c.prepareStatement(queryInserir);
		p.setInt(1,id);
		p.setString(2,idUsuario);
		p.execute();

		p.close();
		c.close();
		gcmConfirma(id, idUsuario);
		return "Perfil Confirmado com Sucesso";

	}
	
	public void gcmConfirma(int idEncontro, String idUsuario) throws SQLException{
		
		String usuario = "";
		
		Connection c = ConnectionMySQL.connectToDatabase();
		
		String query1 = "SELECT nome FROM usuario WHERE id="+idUsuario;
		Statement st = c.createStatement();
		ResultSet rs1 = st.executeQuery(query1);
		rs1.next();
		usuario = rs1.getString("nome");
		st.close();
		c.close();
		
		c = ConnectionMySQL.connectToDatabase();
		String query2 = "SELECT DISTINCT u.id_gcm,e.nome as nome_encontro FROM usuario u, perfisconfirmados pc, encontro e WHERE (u.id=pc.id_usuario or u.id=e.id_dono) and e.id=pc.id_encontro and pc.id_encontro="+idEncontro;
		Statement st2 = c.createStatement();
		ResultSet rs = st2.executeQuery(query2);
		while (rs.next())
		{
			testGCM(rs.getString("id_gcm"), usuario + "C" , rs.getString("nome_encontro") );
			
		}
		rs.close();
		st2.close();
		c.close();
	}
	
public void gcmChegada(int idEncontro, String idUsuario) throws SQLException{
		
		String usuario = "";
		
		Connection c = ConnectionMySQL.connectToDatabase();
		
		String query1 = "SELECT nome FROM usuario WHERE id="+idUsuario;
		Statement st = c.createStatement();
		ResultSet rs1 = st.executeQuery(query1);
		rs1.next();
		usuario = rs1.getString("nome");
		st.close();
		c.close();
		
		c = ConnectionMySQL.connectToDatabase();
		String query2 = "SELECT DISTINCT u.id_gcm,e.nome as nome_encontro FROM usuario u, perfischegaram pc, encontro e WHERE (u.id=pc.id_usuario or u.id=e.id_dono) and e.id=pc.id_encontro and pc.id_encontro="+idEncontro;
		Statement st2 = c.createStatement();
		ResultSet rs = st2.executeQuery(query2);
		while (rs.next())
		{
			testGCM(rs.getString("id_gcm"), usuario + "G" , rs.getString("nome_encontro") );
			
		}
		rs.close();
		st2.close();
		c.close();
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
		Connection c = ConnectionMySQL.connectToDatabase();
		String queryInserir = "INSERT INTO perfischegaram VALUES(?,?)";
		PreparedStatement p = c.prepareStatement(queryInserir);
		p.setInt(1,id);
		p.setString(2,idDono);
		p.execute();

		p.close();
		c.close();
		gcmChegada(id, idDono);
		return "Confirmado com sucesso";
	}

	/**
	 * Cria Usuario;
	 * 
	 * @param usuario
	 * 				Objeto com os dados do usuario
	 * @return
	 * @throws SQLException
	 */
	@POST
	@Path("/criarusuario")
	@Produces("application/json")
	@Consumes("application/json")
	public String criarUsuario(Usuario usuario) throws SQLException {
		Blob blob = new SerialBlob(usuario.getFoto().getBytes());

		try {
			Connection c = ConnectionMySQL.connectToDatabase();
			String queryInserir = "INSERT INTO usuario VALUES(?,?,?,?)";
			PreparedStatement p = c.prepareStatement(queryInserir);
			p.setString(1,usuario.getIdFace());
			p.setString(2,usuario.getNome());
			p.setString(3,usuario.getId_gcm());
			p.setBlob(4, blob);
			p.executeUpdate();
			p.close();
			c.close();
			
		} catch (Exception e) {
			Connection c2 = ConnectionMySQL.connectToDatabase();
			String queryUpdate = "UPDATE usuario SET foto = ? , nome= ? WHERE id=?";
			PreparedStatement p2 = c2.prepareStatement(queryUpdate);
			p2.setBlob(1, blob);
			p2.setString(2, usuario.getNome());
			p2.setString(3,usuario.getIdFace());
			p2.executeUpdate();
			p2.close();
			c2.close();
		}

		return "Usuário criado";

	}
	
	@GET
	@Path("/gcmTeste/{id}")
	@Produces("application/json")
	public String testGCM(@PathParam("id") String id, String message, String message2) throws SQLException {
		
		String apiKey = "AIzaSyCHWRf4nFf5yIakoX5jO8GlCuLj4x1pdDI";
		Content c = new Content();

	        c.addRegId(id);
	        c.createData(message, message2);
	        POST2GCM.post(apiKey, c);
	        return "Sucesso";
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

		Connection c = ConnectionMySQL.connectToDatabase();

		String queryInserir = "INSERT INTO encontro VALUES(0,?,?,?,?, ?, ?,?,?)";

		PreparedStatement p = c.prepareStatement(queryInserir);

		p.setString(1,encontro.getNome());
		p.setString(2, encontro.getLinha());
		p.setString(3,  encontro.getPonto());
		
		

		String horario = encontro.getHorario().toString() + ":00";
		SimpleDateFormat sd = new SimpleDateFormat("HH:mm:ss");
		Time time = null;
		try {
			Date data = sd.parse(horario);
			time = new Time(data.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		p.setTime(4, time);

		String dataEncontro = encontro.getData().getAno()+"-"+encontro.getData().getMes()+"-"+ encontro.getData().getDia();
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		java.sql.Date d2;
		try {
			d2 = new java.sql.Date(formatter.parse(dataEncontro).getTime());
			p.setDate(5, d2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		p.setString(6, encontro.getIdDono()+ "");
		p.setDouble(7, encontro.getLatitude());
		p.setDouble(8, encontro.getLongitude());

		p.executeUpdate();
		p.close();
		c.close();
		
		metodo(encontro.getNome());

		return "Cliente inserido no banco com sucesso!";
	}

	public void metodo(String nomeEncontro) throws SQLException{
		
		Connection c = ConnectionMySQL.connectToDatabase();
		String query = "SELECT id_gcm FROM usuario";
		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery(query);
		while (rs.next())
		{
			testGCM(rs.getString(1), nomeEncontro, "");
			
		}
		rs.close();
		st.close();
		c.close();
		
	}
	//--------------------------METODOS BANCO-----------------------------
	private ArrayList<Encontro> getAuxEncontros(String query) {
		ArrayList<Encontro> encontroList = new ArrayList<Encontro>();

		Connection c;
		try {
			c = ConnectionMySQL.connectToDatabase();

			Statement st = c.createStatement();
			ResultSet rs = st.executeQuery(query);
			Statement st2 = null;
			ResultSet rs2 = null;

			while (rs.next())
			{
				Encontro encontro = new Encontro();
				encontro.setId(rs.getInt("id"));
				encontro.setNome(rs.getString("nome"));
				encontro.setPonto(rs.getString("ponto"));
				encontro.setLinha(rs.getString("linha"));
				encontro.setLatitude(rs.getDouble("latitude"));
				encontro.setLongitude(rs.getDouble("longitude"));

				HorarioDoEncontro h = new HorarioDoEncontro();
				h.setHora(rs.getTime("horario").getHours());
				h.setMin(rs.getTime("horario").getMinutes());
				encontro.setHorario(h);

				DataDoEncontro d = new DataDoEncontro();
				d.setAno(Integer.parseInt(rs.getDate("data_encontro").toString().substring(0,4)));
				d.setMes(Integer.parseInt(rs.getDate("data_encontro").toString().substring(5,7)));
				d.setDia(Integer.parseInt(rs.getDate("data_encontro").toString().substring(8,10)));
				encontro.setData(d);
				d.toString();

				encontro.setIdDono(rs.getString("id_dono"));
				st2 = c.createStatement();
				String queryDono = "SELECT nome FROM usuario WHERE id="+rs.getString("id_dono");
				rs2 = st2.executeQuery(queryDono);

				rs2.next();
				encontro.setNomeDono(rs2.getString("nome"));
				encontroList.add(encontro);
				rs2.close();
				st2.close();
			}
			System.out.println(encontroList.toString());

			rs.close();
			st.close();
			c.close();
			return encontroList;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return encontroList;

	}


}