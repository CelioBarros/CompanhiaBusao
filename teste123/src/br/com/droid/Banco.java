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

	public ArrayList<Encontro> getListaEncontros() throws SQLException{
		
		
		
		ArrayList<Encontro> encontroList = new ArrayList<Encontro>();
		Connection c;
		try {
			c = ConnectionMySQL.connectToDatabase();
	
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = new Date();
			
			String queryDelete= "DELETE FROM encontro WHERE data_encontro < " + "'"+dateFormat.format(date)+"'";
			Statement statementDelete = c.createStatement();
			statementDelete.executeUpdate(queryDelete);
			
			statementDelete.close();	
			
			String query = "SELECT * FROM encontro";
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

	public String confirmaPresenca(int id, String nome) {
		Encontro encontro = buscar(id);
		int pos = getPosition(id);
		if(encontro == null || pos<0){
			return "Encontro não encontrado!";
		} else {
			listaEncontros.get(pos).addPerfisConfirmados(nome);
			return "Perfil Confirmado com Sucesso";
		}
	}

	public String desconfirmarPresenca(int id, String nome) {
		Encontro encontro = buscar(id);
		int pos = getPosition(id);
		if(encontro == null || pos<0){
			return "Encontro não encontrado!";
		} else{
			listaEncontros.get(pos).delPerfilConfirmado(nome);
			return "Perfil desconfirmado com Sucesso";
		}
	}

	public String confirmaQueChegou(int id, String nome) {
		Encontro encontro = buscar(id);
		int pos = getPosition(id);
		if(encontro == null || pos<0){
			return "Encontro não encontrado!";
		} else{
			listaEncontros.get(pos).addPerfisChegados(nome);
			return "Confirmado Chegada";
		}
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