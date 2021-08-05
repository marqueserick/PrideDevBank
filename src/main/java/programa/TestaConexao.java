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
			ContaDao contaDao = new ContaDao();
			ClienteDao clienteDao = new ClienteDao();
			
//			Cliente cliente = new Cliente("Maria","52345678910","Maria");
//			
//			clienteDao.save(cliente);
			
			Cliente cliente = clienteDao.findBy("cpf","52345678910");
			System.out.println(cliente.getId()+" - "+cliente.getNome());
			
//			Conta conta = new Conta("00001","0003",cliente,1500);
//			contaDao.save(conta); 
			
			
			Conta conta = contaDao.findByNumeroAgenciaAndNumeroConta("00001", "0002");
			System.out.println(conta.toString());
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		

	}
}
