package dominio;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ContaInvestimentoTest {
	
	@Test
	void deveAplicarDezPorcentoAoValorDepositado() {
		
		int valorDeposito = 1000;
		ContaInvestimento ci = new ContaInvestimento();
		ci.depositar(valorDeposito);
		assertTrue(ci.getSaldo() == (valorDeposito*1.1));
	}

}
