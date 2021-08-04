package dominio;

import static util.Validador.validaCPF;

public class Cliente {
		protected String nome;
		protected String CPF;
		
		public Cliente(String nome, String CPF) {
			validaCPF(CPF);
			this.nome = nome;
			this.CPF = CPF;
		}

		public String getNome() {
			return nome;
		}

		public String getCPF() {
			return CPF;
		}
		
}
