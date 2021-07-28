package dominio;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String agencia, String numeroConta, String chavePix,
			float valorDepositado) {
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.chavePix = chavePix;
		this.depositar(valorDepositado);
		this.taxaSaque = 0;
		
	}

}
