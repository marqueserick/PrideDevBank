package dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaTest {
	ContaPoupanca cp = new ContaPoupanca("001","00001","0000",500);
	
	@Test
	void deveSerPossivelRealizarSaqueQuandoTemSaldo() {
		cp.sacar(485);
		Assertions.assertTrue(cp.getSaldo()==0);
	}
	
	@Test
	void deveZerarTaxaSaqueContaPoupanca() {
		Assertions.assertTrue(cp.getTaxaSaque()==0);
		
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
