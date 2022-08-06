package entidades;

public final class ContaEspecial extends Conta {

	private Double limite;
	
	public ContaEspecial() {
	this.limite = 1000.0 + super.getSaldo();
	}

	public ContaEspecial(String titular, Integer numConta, Double saldo, Double limite) {
		super(titular, numConta, saldo);
	}

	public Double getLimite() {
		return limite;
	}

	//metodo testa se saque é menor que saldo/limite
	public boolean LimitandoConta(double valor) {
		   if( valor < this.getLimite()) {
			   super.sacar(valor);
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
		
}
