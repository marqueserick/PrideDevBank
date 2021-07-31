package programa;

import java.util.Scanner;

import dominio.*;

public class Main {

	public static void main(String[] args) {

		//Conta conta = new Conta("001","00001", "13981068201", 200);
		//Conta cc = new ContaCorrente("001","00001", "13981068201", 200);		
		//Conta cp = new ContaPoupanca("001","00002", "13981068201", 200);
		//Conta conta = new Conta();
		CaixaEletronico ce = new CaixaEletronico();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite valor que deseja sacar");
		int valor = sc.nextInt();
		ce.retirar(valor);
		
		ContaCorrente cc = new ContaCorrente();
		cc.setSaldo(100);
		cc.sacar(500);
//		String dadosConta = "--- PrideDev Bank ---\n"
//				+ "\nAgência: "+conta.getAgencia()
//				+"\nConta Número: "+conta.getNumeroConta()
//				+"\nChave Pix: "+conta.getChavePix()
//				+"\nSaldo: R$ "+conta.getSaldo();
		
//		System.out.println(conta.toString());
//      System.out.println(dadosConta);
//      conta.sacar(100);
//		cc.transferir(50, cp);
//		System.out.println(cp.getSaldo());
//		conta.adicionarChavePix("email@email.com");
//		conta.adicionarChavePix("13981068201");
//		conta.adicionarChavePix("123456789");
//		conta.adicionarChavePix("outroemail@email.com");
//		
//		int i = 0;
//		while(i<conta.getChavePix().length) {
//			System.out.println(conta.getChavePix()[i]);
//			i++;
//		
//		}
	}

}
