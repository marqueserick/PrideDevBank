package programa;

import dominio.Conta;

public class Main {

	public static void main(String[] args) {

		Conta conta = new Conta("001","00001", "13981068201", 200);
		
		
		String dadosConta = "--- PrideDev Bank ---\n"
				+ "\nAgência: "+conta.getAgencia()
				+"\nConta Número: "+conta.getNumeroConta()
				+"\nChave Pix: "+conta.getChavePix()
				+"\nSaldo: R$"+String.format("%.2f",conta.getSaldo());
		
		System.out.println(dadosConta);

	}

}
