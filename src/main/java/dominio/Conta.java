package dominio;

public class Conta {
	private String agencia;
	private String numeroConta;
	private String chavePix;
	private float saldo = -15;
	
	
	public Conta() {
		
	}
	public Conta(String agencia, String numeroConta, String chavePix,
			float valorDepositado) {
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.chavePix = chavePix;
		this.depositar(valorDepositado);
	}
	private void depositar(float valorDepositado) {
		this.saldo += valorDepositado;
		
	}
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getChavePix() {
		return chavePix;
	}
	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}
	public float getSaldo() {
		return saldo;
	}

}
