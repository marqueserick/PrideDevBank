package dominio;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ContaTest {
	
	@Test
	void deveSerPossivelCriarUmaConta() {
		//preparaçao
		//execução
		
		Conta conta = new Conta();
		//validação
		assertTrue(conta != null);
	}
	
	@Test
	void deveSerPossivelAdicionarUmaChavePix() {
		//preparação
		Conta conta = new Conta();
		//execucão
		conta.adicionarChavePix("anaalice.cd@gmail.com");
		//validação
		assertTrue(conta.getChavePix()[0].equals("anaalice.cd@gmail.com"));
	}
	@Test
	void deveSerPossivelSacarQuandoTemosLimite() {
		//preparaçao
		Conta conta = new Conta();
		conta.depositar(1000);
		//execução
		conta.sacar(200);
		
		//validação
		assertTrue(800 == conta.getSaldo() );
	}

}
