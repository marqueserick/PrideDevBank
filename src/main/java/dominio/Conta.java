package dominio;

public class Conta {
	protected String agencia;
	protected String numeroConta;
	protected String chavePix;
	protected float saldo = -15;
	protected float taxaSaque = 5;
	
	
	public Conta() {
		
	}
	public Conta(String agencia, String numeroConta, String chavePix,
			float valorDepositado) {
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.chavePix = chavePix;
		this.depositar(valorDepositado);
	}
	public void depositar(float valorDepositado) {
		this.saldo += valorDepositado;
		
	}
	
	public void sacar(float valorSaque) {
		valorSaque += taxaSaque;
		
		if(this.saldo >= valorSaque) {
			this.saldo -= valorSaque;
			System.out.println("SAQUE REALIZADO: R$ "+valorSaque+"\n"+this.toString());
		}else {
			throw new RuntimeException("N�o foi poss�vel sacar");
		}
	}
	
	public void transferir(float valorTransferir, Conta contaDestino ) {
		this.sacar(valorTransferir);
		contaDestino.depositar(valorTransferir);
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
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public float getTaxaSaque() {
		return taxaSaque;
	}
	public void setTaxaSaque(float taxaSaque) {
		this.taxaSaque = taxaSaque;
	}
	
	
	
	
	@Override
	public String toString() {
		return "--- PrideDev Bank ---\n"
				+"\nAg�ncia: "+this.agencia
				+"\nConta N�mero: "+this.numeroConta
				+"\nChave Pix: "+this.chavePix
				+"\nSaldo: R$"+this.saldo;
	}
}
