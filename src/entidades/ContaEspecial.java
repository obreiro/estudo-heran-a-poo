package entidades;

public class ContaEspecial extends Conta {

	private Double limite;

	public ContaEspecial() {
		
	}

	public ContaEspecial(String titular, Integer numConta, Double saldo, Double limite) {
		super(titular, numConta, saldo);
		this.limite = limite;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite + this.getSaldo();
	}
	
	public boolean LimitandoConta(double valor) {
		//this.setLimite(getLimite() + super.getSaldo()); 
		if( valor <= this.getLimite()) {
			this.limite -= valor; 
			return true;
		} else {
			System.out.println("Saldo indiponivel");
			return false;
		}	
	}
	
	@Override
	public String toString() {
		String info = "\nTitular: " + this.getTitular();
		info += "\nNúmero da conta: " + this.getNumConta();
		info += "\nLimite da conta: " + this.getLimite();
		return info;
	}
	
	
}
