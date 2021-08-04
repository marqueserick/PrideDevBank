package dominio;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContaCorrenteTest {
	ContaCorrente conta;
	
	@BeforeEach
	void iniciar() {
		conta = new ContaCorrente();
		conta.depositar(100);
	}
	
	@Test
	void deveSerPossivelSacarUtilizandoChequeEspecial() {
		//preparacao
		//execucao
		conta.sacar(176);
		//validacao
		assertTrue(conta.getSaldo() == -76);
		assertTrue(conta.getChequeEspecial()==24);		
	}
	
	@Test
	void deveSerPossivelSacarComSaldo() {
		conta.sacar(99);
		assertTrue(conta.getSaldo()==1);
	}

}
