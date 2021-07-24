package dominio;

public class Conta {
	public String agencia;
	public String numeroConta;
	public float saldo = -15;
	
	public Conta() {
		
	}
	public Conta(String agencia, String numeroConta, float valorDepositado) {
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.depositar(valorDepositado);
	}
	private void depositar(float valorDepositado) {
		this.saldo += valorDepositado;
		
	}

}
