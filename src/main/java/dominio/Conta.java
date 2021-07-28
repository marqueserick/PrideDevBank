package dominio;

public class Conta {
	protected String agencia;
	protected String numeroConta;
	protected String chavePix;
	protected float saldo = -15;
	protected static float taxaSaque = 5;
	
	
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
		valorSaque += this.taxaSaque;
		
		if(this.saldo >= valorSaque) {
			this.saldo -= valorSaque;
			System.out.println("SAQUE REALIZADO: R$ "+valorSaque+"\nSaldo: R$ "+this.saldo);
		}else {
			throw new RuntimeException("Não foi possível sacar");
		}
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
	
	
	
	
//	@Override
//	public String toString() {
//		return "--- PrideDev Bank ---\n"
//				+"\nAgência: "+this.agencia
//				+"\nConta Número: "+this.numeroConta
//				+"\nChave Pix: "+this.chavePix
//				+"\nSaldo: R$"+this.saldo;
//	}
}
