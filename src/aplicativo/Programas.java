package aplicativo;

import java.util.Scanner;

import entidades.Conta;
import entidades.ContaEspecial;
import entidades.ContaPoupanca;

public class Programas {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Conta c = new Conta();
		ContaEspecial ce = new  ContaEspecial();
		ContaPoupanca cp = new ContaPoupanca();
		
		c.setTitular("José Paulo");
		c.setNumConta(22180);
		c.setSaldo(1000.0);
		 System.out.println(c);
		 
		 System.out.println();
		 
		 c.depositar(200);
		 System.out.println("Saldo após deposito" + c);
		 
		 System.out.println();
		 System.out.println("*** Conta Especial ***");
		
		 
		 ce.setTitular("Jose Paulo");
		 ce.setNumConta(22180);
		 ce.setSaldo(c.getSaldo());//setando saldo 
		 ce.setLimite(300.0);
		 System.out.println(ce);
		 
		 System.out.println();
		 System.out.println("Teste da função limitandoConta()");
		 System.out.print("Entre com valor do saque: ");
		 
		 double saqueContaEspecial = scan.nextDouble();
		 
		 if(ce.LimitandoConta(saqueContaEspecial)) {
			 ce.sacar(saqueContaEspecial);
			 System.out.println("\nSaldo após verificação: " + ce);
		 } else {
			 System.out.println("\nLimite indisponivel");
		 }
		
		 System.out.println();
		 System.out.println("*** Conta Poupança ***");
		 
		 cp.setSaldo(c.getSaldo());
	     cp.atualizaSaldo();
		 cp.sacar(100);
		 System.out.println(cp);
		 
		 scan.close();
	}
}
