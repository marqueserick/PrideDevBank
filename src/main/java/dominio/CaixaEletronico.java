package dominio;

public class CaixaEletronico {
	
	public static int[] retirar(int valor) {
		int notas[] = { 100, 50, 20, 10, 2 };
		int quantidadeDeNotas[]  = new int[notas.length];

		while (valor > 0) {
			int i = 0;			
			while (valor >= notas[i]) {
				valor -= notas[i];
				quantidadeDeNotas[i]++;
			}
//			if(quantidadeDeNotas[i]>0) {
//			System.out.println("O numero de notas de R$" + notas[i] + " é " + quantidadeDeNotas[i]);
//			}
			i++;
		}//fim do while
		
		return quantidadeDeNotas;	
		
	}
}
