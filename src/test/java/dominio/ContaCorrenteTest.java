package dominio;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ContaCorrenteTest {
	
	@Test
	void deveSerpossivelSacarUtilizandoChequeEspecial() {
		//preparacao
		ContaCorrente conta = new ContaCorrente();
//		execucao
		conta.depositar(100);
		conta.sacar(176);
		//validacao
		assertTrue(conta.getSaldo() == -76);
		assertTrue(conta.getChequeEspecial()==24);		
	}
	
	@Test
	void naoDeveSerPossivelSacarAlemDoChequeEspecial() {
		
		ContaCorrente conta = new ContaCorrente();
		assertThrows(RuntimeException.class,()-> conta.sacar(200));
		}

}
