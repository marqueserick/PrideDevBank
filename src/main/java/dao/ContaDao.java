package dao;

import java.sql.*;

import dominio.*;
import factory.*;

public class ContaDao {
	Connection con;
	
	public ContaDao() throws SQLException{
		con = ConnectionFactory.getConnection();
		
	}
	
	public void save (Conta conta) throws SQLException {
		Statement stm = con.createStatement();
		String mysql = "insert into conta(numeroAgencia, numeroConta, saldo, idCliente) values ("
				+"'"+conta.getAgencia()+"'"
				+",'"+conta.getNumeroConta()+"'"
				+",'"+conta.getSaldo()+"'"
				+",'"+conta.getCliente().getId()+"');";
		stm.execute(mysql);
		
	}
	
	public Conta findByNumeroAgenciaAndNumeroConta(String numeroAgencia, String numeroConta) throws SQLException {
		Conta conta = null;
		Statement st = con.createStatement();
		String mysql = "select * from conta where numeroAgencia = '"+numeroAgencia+"' and numeroConta = '"+numeroConta+"';";
		st.execute(mysql);
		ResultSet result = st.getResultSet();
		while(result.next()) {
			int id = result.getInt("id");
			int idCliente = result.getInt("idCliente");
			float saldo = result.getFloat("saldo");
			ClienteDao clienteDao = new ClienteDao();
			Cliente cliente = clienteDao.findByID(idCliente);  
			conta = new Conta(id, numeroAgencia, numeroConta, cliente, saldo);
		}
		return conta;
	}

}
