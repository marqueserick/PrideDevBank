package dao;

import java.sql.*;
import java.sql.SQLException;

import dominio.Cliente;
import factory.ConnectionFactory;

public class ClienteDao {
	
	Connection con;
	
	public ClienteDao() throws SQLException {
		con = ConnectionFactory.getConnection();
	}
	
	public void save(Cliente cliente) throws SQLException {
		Statement st = con.createStatement();
		String mysql = "insert into cliente(nome, cpf, nomeSocial) values("
				+ "'"+cliente.getNome()+"'"
				+",'"+cliente.getCPF()+"'"
				+",'"+cliente.getNomeSocial()+"');";
		st.execute(mysql);
		
	}
	
//	public Cliente findByCPF(String CPF) throws SQLException {
//		Cliente cliente = null;
//		Statement st = con.createStatement();
//		String mysql = "select * from cliente where cpf ='"+CPF+"';";
//		st.execute(mysql);
//		ResultSet result = st.getResultSet();
//		
//		while(result.next()) {			
//			int id = result.getInt("id");
//			String nome = result.getString("nome");
//			String nomeSocial = result.getString("nomeSocial");
//			cliente = new Cliente(nome, CPF, nomeSocial, id);			
//		}
//		
//		return cliente;
//	}
//	
//	public Cliente findByID(int id) throws SQLException {
//		Cliente cliente = null;
//		Statement st = con.createStatement();
//		String mysql = "select * from cliente where id ='"+id+"';";
//		st.execute(mysql);
//		ResultSet result = st.getResultSet();
//		
//		while(result.next()) {		
//			String CPF = result.getString("cpf");
//			String nome = result.getString("nome");
//			String nomeSocial = result.getString("nomeSocial");
//			cliente = new Cliente(nome, CPF, nomeSocial, id);			
//		}
//		
//		return cliente;
//	}
	
	public Cliente findBy(String parametroBusca, String valorBusca) throws SQLException {
		if(parametroBusca.equals("id")) {
			Integer.parseInt(valorBusca);
		}
		Cliente cliente = null;
		Statement st = con.createStatement();
		String mysql = "select * from cliente where "+parametroBusca+ "='"+valorBusca+"';";
		st.execute(mysql);
		ResultSet result = st.getResultSet();
		
		while(result.next()) {		
			String CPF = result.getString("cpf");
			String nome = result.getString("nome");
			String nomeSocial = result.getString("nomeSocial");
			int id = result.getInt("id");
			cliente = new Cliente(nome, CPF, nomeSocial,id);			
		}
	
		
		return cliente;
	}

}
