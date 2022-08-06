package entidades;

public class Conta {

	private String titular;
	private Integer numConta;
	private Double saldo;
	
	public Conta() {
    this.saldo = 1000.0;
	}

	public Conta(String titular, Integer numConta, Double saldo) {
		
		this.titular = titular;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Integer getNumConta() {
		return numConta;
	}

	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void sacar(double valor) {
		this.saldo -= valor;
	}

	@Override
	public String toString() {

		String info = "\nTitular: " + this.getTitular();
		info += "\nNúmero da conta: " + this.getNumConta();
		info += "\nSaldo: " + this.getSaldo();
		return info;
	}
}
