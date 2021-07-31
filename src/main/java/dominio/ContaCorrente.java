package dominio;

import exceptions.SaldoInsuficienteException;

public class ContaCorrente extends Conta{
	
	private float chequeEspecial = 100;

	@Override
	public void sacar(float valorSaque)  {
		valorSaque += this.taxaSaque;
		if(this.saldo >= valorSaque) {
			this.saldo -= valorSaque;
			//System.out.println("SAQUE REALIZADO: R$ "+valorSaque+"\nSaldo: R$ "+this.saldo);
		} else if((this.saldo + this.chequeEspecial) >= valorSaque){
			String resultado = "SAQUE REALIZADO: R$ "+valorSaque;
			valorSaque -= this.saldo;
			this.saldo = 0;
			this.saldo -= valorSaque;
			this.chequeEspecial -= valorSaque;
			//System.out.println(resultado+"\nSaldo: R$ "+this.saldo+"\nSaldo Cheque Especial: R$ "+this.chequeEspecial);
		}else {
			throw new SaldoInsuficienteException("SALDO INSUFICIENTE");
		}	
	}// fim do metodo sacar
	
	public float getChequeEspecial() {
		return this.chequeEspecial;
	}

}
