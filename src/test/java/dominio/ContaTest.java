package dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaTest {
	
	@Test
	void deveSerPossivelRealizarSaqueQuandoTemSaldo() {
		ContaPoupanca cp = new ContaPoupanca("001","00001","0000",500);
		cp.sacar(480);
		Assertions.assertTrue(cp.getSaldo()==0);
	}
	
	@Test
	void deveCriarNovaContaSemParametros() {
		
		Conta conta = new Conta();
		Assertions.assertTrue(conta!=null);
	}
	
	@Test
	void deveSerPossivelCriarContaComSaldoNumeroAgenciaNumeroConta() {
		
//		float valorDepositado = 300;
//		Conta conta = new Conta("001","00001",valorDepositado);
//		
//		Assertions.assertTrue(conta.saldo == (valorDepositado - 15));
//		Assertions.assertTrue(conta.agencia.equals("001"));
//		Assertions.assertTrue(conta.numeroConta.equals("00001"));

		
	}
}
