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
		String sql = "insert into conta(numeroAgencia, numeroConta) values ('"+conta.getAgencia()+"','"+conta.getNumeroConta()+"');";
		stm.execute(sql);
		
	}

}
