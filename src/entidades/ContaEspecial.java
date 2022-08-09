package entidades;

public final class ContaEspecial extends Conta {

	private Double limite;
	
	public ContaEspecial() {
	this.limite = 1000.0;
	}
    
	public ContaEspecial(String titular, Integer numConta, Double saldo, ContaPoupanca cp, ContaEspecial ce,
			Double limite) {
		super(titular, numConta, saldo, cp, ce);
		
	}


	/*public void setLimite(Double limite) {
		this.limite = limite + super.getSaldo() ;
	}*/

	public Double getLimite() {
		return limite;
	}

	//metodo testa se saque é menor que saldo/limite
	public boolean LimitandoConta(double valor) {
		   if( valor < this.getLimite()) {
			   //super.sacar(valor);
		    return true;
		} else {
			 return false;
		}
	}
	
	//se saque for menor metodo sacar é chamado com desconto de 2.0
	public void sacar(double valor) {
		super.sacar(valor);
		 System.out.println("Conta Especial");
		this.limite -= valor ;
	}
	
	@Override
	public String toString() {

		//String info = "\nTitular: " + this.getTitular();
		//info += "\nNúmero da conta: " + this.getNumConta();
		//info += "\nSaldo: " + this.getSaldo();
		String info = "\nSaldo Limite: " + this.getLimite();
		return info;
	}
}
