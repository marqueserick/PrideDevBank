package dominio;

import static util.Validador.validaCPF;

public class Cliente {
	protected String nome;
	protected String nomeSocial;
	protected String CPF;
	protected int id;
	
	public Cliente() {
		
	}

	public Cliente(String nome, String CPF, String nomeSocial) {
		validaCPF(CPF);
		this.nome = nome;
		this.CPF = CPF;
		this.nomeSocial = nomeSocial;
	}

	public Cliente(String nome, String CPF, String nomeSocial, int id) {
		this.nome = nome;
		this.CPF = CPF;
		this.nomeSocial = nomeSocial;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public String getNomeSocial() {
		return nomeSocial;
	}

	public String getCPF() {
		return CPF;
	}

	public int getId() {
		return id;
	}

}
