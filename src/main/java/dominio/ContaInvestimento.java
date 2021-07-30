package dominio;

public class ContaInvestimento extends Conta{
	
	@Override
	public void sacar(float valorSaque) {
		throw new RuntimeException("Não é possível sacar");
	}
	
	@Override
	public void depositar(float valorDeposito) {
		this.saldo += (valorDeposito * 1.1); 
	}

}
