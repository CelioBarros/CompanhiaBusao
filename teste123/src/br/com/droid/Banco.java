package br.com.droid;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;




import java.util.Date;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Time;

import com.google.gson.JsonElement;

import br.com.droid.model.Encontro;

public class Banco {

	private static Banco instance;
	private ArrayList<Encontro> listaEncontros;
	private int idCliente;

	private Banco() {
		idCliente = 1;
		listaEncontros = new ArrayList<Encontro>();
	}

	public static Banco getBancoInstance(){
		if(instance==null)
			instance = new Banco();
		return instance;
	}

	public ArrayList<String> getPerfisChegaram(int idEncontro) {
		ArrayList<String> nomes = new ArrayList<String>();
		String query = "select u.nome from usuario u, perfischegaram pc where pc.id_usuario = u.id and pc.id_encontro=" + idEncontro;
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
		
		return nomes;
	}
	
	public ArrayList<String> getPerfisConfirmados(int idEncontro) {
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
		
		return nomes;
	}
	
	public ArrayList<Encontro> getMeusEncontros(String idUsuario) {
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
		return getAuxEncontros(query);
	}
	
	
	
	public ArrayList<Encontro> getEncontrosNaoParticipo(String idUsuario) {
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
				query = "SELECT DISTINCT e.* FROM encontro e, perfisconfirmados pc WHERE e.id_dono!="+idUsuario +" or (pc.id_encontro=e.id and pc.id_usuario!="+idUsuario+") ORDER BY e.data_encontro";
			}
			rs.close();
			st.close();

		
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return getAuxEncontros(query);
	}

	
	public ArrayList<Encontro> getListaEncontros() throws SQLException{
		
		
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

	public String inserir(Encontro encontro) throws SQLException{
		Connection c = ConnectionMySQL.connectToDatabase();

		String queryInserir = "INSERT INTO encontro VALUES(0,?,?,?,?, ?, ?)";

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

		p.executeUpdate();
		p.close();
		c.close();


		return "Cliente inserido no banco com sucesso!";
	}

	public Encontro buscar(int id){
		Encontro cliente = null;
		for (int i = 0; i < listaEncontros.size(); i++) {
			if (listaEncontros.get(i).getId() == id){
				cliente = new Encontro();
				cliente = listaEncontros.get(i);
				break;
			}
		}
		return cliente;
	}

	private int getPosition(int id) {
		int pos = -1;
		for (int i = 0; i < listaEncontros.size(); i++) {
			if (listaEncontros.get(i).getId() == id){
				pos = i;
			}
		}
		return pos;
	}

	public String delete(int id) throws SQLException{
		
		Connection c = ConnectionMySQL.connectToDatabase();
		String queryInserir = "DELETE FROM encontro WHERE id="+ id;
		PreparedStatement p = c.prepareStatement(queryInserir);
		p.execute();
		p.close();
		c.close();
		return "Encontro removido com sucesso!";

	}

	public String confirmaPresenca(int id, String idUsuario) throws SQLException {
		Connection c = ConnectionMySQL.connectToDatabase();
		String queryInserir = "INSERT INTO perfisconfirmados VALUES(?,?)";
		PreparedStatement p = c.prepareStatement(queryInserir);
		p.setInt(1,id);
		p.setString(2,idUsuario);
		p.execute();
		
		p.close();
		c.close();
			return "Perfil Confirmado com Sucesso";
		
	}

	public String desconfirmarPresenca(int idEncontro, String idUsuario) throws SQLException {
		Connection c = ConnectionMySQL.connectToDatabase();
		String queryInserir = "DELETE FROM perfisconfirmados WHERE id_encontro= ? and id_usuario=?";
		PreparedStatement p = c.prepareStatement(queryInserir);
		p.setInt(1,idEncontro);
		p.setString(2, idUsuario);
		p.execute();
			return "Perfil desconfirmado com Sucesso";
	
	}

	public String confirmaQueChegou(int id, String idDono) throws SQLException {
		Connection c = ConnectionMySQL.connectToDatabase();
		String queryInserir = "INSERT INTO perfischegaram VALUES(?,?)";
		PreparedStatement p = c.prepareStatement(queryInserir);
		p.setInt(1,id);
		p.setString(2,idDono);
		p.execute();
		
		p.close();
		c.close();
		
		return "Confirmado com sucesso";
	}

	public String criarUsuario(String id, String nome) throws SQLException {
		Connection c;

		c = ConnectionMySQL.connectToDatabase();
		String queryInserir = "INSERT INTO usuario VALUES(?,?)";
		PreparedStatement p = c.prepareStatement(queryInserir);
		p.setString(1,id);
		p.setString(2,nome);
		p.executeUpdate();
		p.close();
		c.close();

		return "Usuário criado";
	}


	




}