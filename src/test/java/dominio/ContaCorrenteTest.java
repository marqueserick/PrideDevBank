package dominio;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ContaCorrenteTest {
	ContaCorrente conta;
	
	@BeforeEach
	void init() {
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
	void naoDeveSerPossivelSacarAlemDoChequeEspecial() {
		ContaCorrente conta = new ContaCorrente();
		assertThrows(RuntimeException.class,()-> conta.sacar(201));
		}
	
	@Test
	void deveSerPossivelSacarComSaldo() {
		conta.sacar(99);
		assertTrue(conta.getSaldo()==1);
	}

}
