package dominio;

public class ContaCorrente extends Conta{
	
	private float chequeEspecial = 100;
	
	public ContaCorrente(String agencia, String numeroConta, String chavePix,
			float valorDepositado) {
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.chavePix = chavePix;
		this.depositar(valorDepositado);
	}

	@Override
	public void sacar(float valorSaque) {
		valorSaque += this.taxaSaque;
		if(this.saldo >= valorSaque) {
			this.saldo -= valorSaque;
			System.out.println("SAQUE REALIZADO: R$ "+valorSaque+"\nSaldo: R$ "+this.saldo);
		} else if((this.saldo + this.chequeEspecial) >= valorSaque){
			String resultado = "SAQUE REALIZADO: R$ "+valorSaque;
			valorSaque -= this.saldo;
			this.saldo = 0;
			this.chequeEspecial -= valorSaque;
			System.out.println(resultado+"\nSaldo: R$ "+this.saldo+"\nSaldo Cheque Especial: R$ "+this.chequeEspecial);
		}else {
			throw new RuntimeException("Não foi possível sacar");
		}
		
	}

}
