package aplicativo;

import java.util.Scanner;

import entidades.Conta;
import entidades.ContaEspecial;
import entidades.ContaPoupanca;

public class Programas {
	public static void main(String[] args) {
		
  Scanner scan = new Scanner(System.in);
		
	ContaPoupanca cp = new ContaPoupanca();
	Conta c = new Conta();
    ContaEspecial ce = new  ContaEspecial();
	
	System.out.println("*** Menu Banco Nacional ***");
	System.out.println("Conta Corrente [1]  Conta Poupança [2] ");
	int opcao = scan.nextInt();

	switch(opcao) {
		     case 1: 
			 c.setTitular("José Paulo");
			 c.setNumConta(22180);
			 cp.setSaldo(c.getSaldo());
			 System.out.println(c); 
			 System.out.println();
			
			 System.out.print("Entre com valor do deposito: ");
			 double deposito = scan.nextDouble();
			 c.depositar(deposito);
			 System.out.println(c);
			 
			 System.out.print("Entre com valor do saque: ");
			 double saque = scan.nextDouble();
			 
				 if(ce.LimitandoConta(saque)) {
					 System.out.println("condição abaixo do saldo ");
					  ce.sacar(saque);
					  c.sacar(saque); 
				} else {
				   System.out.println("Operação indiponivel: " +  ce.getLimite());
				}
				 
			 System.out.println(c);
			 System.out.println("\nLimite: " + ce.getLimite());
		     break;
		     
		     case 2:
		     
		     System.out.println("*** Conta Poupança ***");
			 cp.atualizaSaldo();
			 System.out.println(cp);
			 break;
			 
			 default:
				  System.out.println("Opção incorreta");
		 }
		
		 scan.close();
	}
}
