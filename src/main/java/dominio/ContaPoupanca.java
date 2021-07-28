package dominio;

public class ContaPoupanca extends Conta {

	static {
		taxaSaque = 0;
	}
	
	
	public ContaPoupanca(String agencia, String numeroConta, String chavePix,
			float valorDepositado) {
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.chavePix = chavePix;
		this.depositar(valorDepositado);
	}

}
