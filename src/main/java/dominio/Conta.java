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
	
	public String getNumeroConta() {
		return numeroConta;
	}
	
	public String getChavePix() {
		return chavePix;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	
	@Override
	public String toString() {
		return "--- PrideDev Bank ---\n"
				+"\nAgência: "+this.agencia
				+"\nConta Número: "+this.numeroConta
				+"\nChave Pix: "+this.chavePix
				+"\nSaldo: R$"+String.format("%.2f",this.saldo);
	}
}
