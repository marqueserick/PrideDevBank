package dominio;

public class Conta {
	protected int id;
	protected String agencia;
	protected String numeroConta;
	protected String chavePix[] = new String[3];
	protected float saldo;
	protected float taxaSaque = 0;
	protected Cliente cliente;

	public Conta() {

	}

	public Conta(String agencia, String numeroConta, Cliente cliente, float saldo) {
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public Conta(int id, String agencia, String numeroConta, Cliente cliente, float saldo) {
		this.id = id;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.cliente = cliente;
		this.saldo = saldo;
	}

	public Conta(String agencia, String numeroConta, String[] chavePix, float valorDepositado) {
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.chavePix = chavePix;
		this.depositar(valorDepositado);
	}

	public void depositar(float valorDepositado) {
		this.saldo += valorDepositado;

	}

	public void sacar(float valorSaque) {
		valorSaque += taxaSaque;

		if (this.saldo >= valorSaque) {
			this.saldo -= valorSaque;
			System.out.println("SAQUE REALIZADO: R$ " + valorSaque + "\nSaldo: R$ " + this.saldo);
		} else {
			throw new RuntimeException("SALDO INSUFICIENTE");
		}
	}

	public void transferir(float valorTransferir, Conta contaDestino) {
		this.sacar(valorTransferir);
		contaDestino.depositar(valorTransferir);
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String[] getChavePix() {
		return chavePix;
	}

	public void adicionarChavePix(String chavePix) {
		int i = 0;

		while (i < this.chavePix.length) {

			if (this.chavePix[i] == null) {
				this.chavePix[i] = chavePix;
				i = this.chavePix.length;
			} else {
				i++;
			}
		}
	}
	
	public int getId() {
		return id;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getTaxaSaque() {
		return taxaSaque;
	}

	public void setTaxaSaque(float taxaSaque) {
		this.taxaSaque = taxaSaque;
	}

	public Cliente getCliente() {
		return cliente;
	}

	@Override
	public String toString() {
		return "--- PrideDev Bank ---\n" + cliente.getNomeSocial()+"\nCPF: "+ cliente.getCPF()
		+"\nAgência: " + this.agencia + "\nConta Número: " + this.numeroConta
				+ "\nSaldo: R$" + this.saldo;
	}
}
