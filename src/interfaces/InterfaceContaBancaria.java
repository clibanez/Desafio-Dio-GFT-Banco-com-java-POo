package interfaces;

import entitis.ContaBancaria;

public interface InterfaceContaBancaria {

	// Metodo para depositar
	public void depositar(double valorDoDeposito);

	// Metodo para sacar
	public void sacar(double valorDoSaque);

	// Metodo transferencia
	public void transfere(double valorDatransferencia, ContaBancaria contaDoDestinatario);
	
	//metodo extrato
	public void imprimirExtrato();

	

}
