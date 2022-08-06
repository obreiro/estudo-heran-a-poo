package entidades;

public class ContaPoupanca extends Conta {

	public static double TAXA = 0.10;

	public ContaPoupanca() {
		
	}

	public ContaPoupanca(String titular, Integer numConta, Double saldo, Double taxa) {
		super(titular, numConta, saldo);
	}
	
	public void  atualizaSaldo() {
		double tx = TAXA*super.getSaldo();
	    this.setSaldo(getSaldo() + tx);
	}
	

	@Override
	public String toString() {
		String info = "\nSaldo Poupança: " + this.getSaldo();
		return info;
	}
	
	
}
