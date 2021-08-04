package programa;

import java.sql.*;
import dao.*;
import dominio.*;
import factory.*;

public class TestaConexao {

	public static void main(String[] args) {
		try {
//			Connection conector = ConnectionFactory.getConnection();
//			
//			Statement comando = conector.createStatement();
//			comando.execute("select * from conta");
//			ResultSet resultado = comando.getResultSet();
//			
//			while(resultado.next()) {
//				String numeroConta = resultado.getString("numeroConta");
//				String numeroAgencia = resultado.getString("numeroAgencia");
//				float saldo = resultado.getFloat("saldo");
//				System.out.println("Agência: "+numeroAgencia+"\nConta n° "+numeroConta+"\nSaldo R$ "+String.format("%.2f", saldo)+"\n");
//			}
//			conector.close();
			ContaDao contaDAO = new ContaDao();
			Conta conta = new Conta("00001","0010");
			contaDAO.save(conta);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		

	}
}
