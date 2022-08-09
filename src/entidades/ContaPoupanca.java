package entidades;

public class ContaPoupanca extends Conta {

	public static double TAXA = 0.10;

	public ContaPoupanca() {
		
	}

	public ContaPoupanca(String titular, Integer numConta, Double saldo, ContaPoupanca cp, ContaEspecial ce) {
		super(titular, numConta, saldo, cp, ce);
	}

	public void atualizaSaldo(double valor) {
		double tx = (super.getSaldo() + valor);
	    this.setSaldo(tx);
	}

	@Override
	public String toString() {
		/*String info = "\nTitular: " + this.getTitular();
		info += "\nNúmero da conta: " + this.getNumConta();
		 info = "\nSaldo: " + this.getSaldo();*/
		String info = super.toString();
		info += "\nSaldo Poupança: " + this.getSaldo();
		return info;
	}
}
