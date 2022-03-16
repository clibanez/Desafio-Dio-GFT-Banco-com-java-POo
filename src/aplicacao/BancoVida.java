package aplicacao;

import java.util.Scanner;

import entitis.Cliente;
import entitis.ContaBancaria;
import entitis.ContaCorrente;
import entitis.ContaPoupanca;

public class BancoVida {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Cadastro de Cliente");
		System.out.println("");
		System.out.println("Digite seu nome: ");
		String nome = scan.next();
		System.out.println("Digite seu CPF: ");
		String Cpf = scan.next();
		System.out.println("Digite o País onde mora: ");
		String pais = scan.next();
		
		
		Cliente cliente = new Cliente(nome, Cpf, pais);
		
		System.out.println("");
		System.out.println("===Cliente cadastrado com sucesso!===");
		
		System.out.println("CLIENTE cadastrado: " + cliente.getNome());
		System.out.println("CPF cadastrado: " + cliente.getCpf());
		System.out.println("PAIS de Origem: " + cliente.getPais());
		
		System.out.println("Digiteo valor de Deposito: ");
		int depositarValor = scan.nextInt();
		
		ContaBancaria conta = new ContaCorrente(cliente);
		ContaBancaria contaPoupanca = new ContaPoupanca(cliente);
		
		conta.depositar(depositarValor);
		conta.transfere(depositarValor, contaPoupanca);
		
		conta.imprimirExtrato();
	    contaPoupanca.imprimirExtrato();
		
		
		
		
		
		
		
		
	}

}
