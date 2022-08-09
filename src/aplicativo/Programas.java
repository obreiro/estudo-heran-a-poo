package aplicativo;

import java.util.Scanner;

import entidades.Conta;
import entidades.ContaEspecial;
import entidades.ContaPoupanca;

public class Programas {
	public static void main(String[] args) {
		
  Scanner scan = new Scanner(System.in);
	
	System.out.println("*** Menu Banco Nacional ***");
	
	System.out.print("Entre com titular: ");
	String nome = scan.nextLine();
	
	System.out.print("Entre com numero da conta: ");
	int numero = scan.nextInt();
	
	System.out.print("Valor do deposito: ");
	double deposito = scan.nextDouble();
	scan.nextLine();
	
	Conta[] contas = new Conta[2];
	for (int i = 0; i < contas.length; i++) {
		
		Conta c = new Conta();
		ContaEspecial ce = new ContaEspecial();
		ContaPoupanca cp = new ContaPoupanca();
		
		System.out.println("Conta Corrente [1]  Conta Poupança [2] ");
		int opcao = scan.nextInt();
		scan.nextLine();
		
		switch (opcao) {
		case 1:
			c.setTitular(nome);
			c.setNumConta(numero);
			c.depositar(deposito);
			System.out.print("Entre com valor do saque: ");
			double saque = scan.nextDouble();
			
			if (ce.LimitandoConta(saque) == true) {
				System.out.println("condição abaixo do saldo ");
				ce.sacar(saque);
				c.sacar(saque);
			} else {
				System.out.println("Operação indiponivel: " + ce.getLimite());
			}

			System.out.println("\nLimite: " + ce.getLimite());
			System.out.print(c + "\n");
			break;
		case 2:
			cp.setTitular(nome);
			cp.setNumConta(numero);
			cp.atualizaSaldo(deposito);
			System.out.print(cp + "\n");
			break;
		default:
			System.out.println("\nOPIÇÃO INCORRETA");
		}
		c.setCp(cp);
		c.setCe(ce);
		contas[i] = c;
	}

	scan.close();
}
}
