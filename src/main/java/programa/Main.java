package programa;

import dominio.*;

public class Main {

	public static void main(String[] args) {

		//Conta conta = new Conta("001","00001", "13981068201", 200);
		ContaCorrente contaCorrente = new ContaCorrente("001","00001", "13981068201", 200);		
		ContaPoupanca cp = new ContaPoupanca("001","00002", "13981068201", 200);
		
//		String dadosConta = "--- PrideDev Bank ---\n"
//				+ "\nAgência: "+conta.getAgencia()
//				+"\nConta Número: "+conta.getNumeroConta()
//				+"\nChave Pix: "+conta.getChavePix()
//				+"\nSaldo: R$ "+conta.getSaldo();
		
//		System.out.println(conta.toString());
		//System.out.println(dadosConta);
		//conta.sacar(100);

		contaCorrente.transferir(50, cp);
		System.out.println(cp.toString());
		

	}

}
