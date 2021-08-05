package dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import util.Validador;


public class ClienteTest {
	
	@Test
	void deveSerPossivelCriarClientePassandoValores() throws Exception {
		
		Cliente cliente = new Cliente("Ana","12345678900","Ana");
		
		Assertions.assertTrue(cliente.getNome().equals("Ana"));
		Assertions.assertTrue(cliente.getCPF().equals("12345678900"));
		
		
	}


}
