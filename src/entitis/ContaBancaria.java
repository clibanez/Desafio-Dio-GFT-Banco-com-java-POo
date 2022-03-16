package entitis;

import interfaces.InterfaceContaBancaria;

public abstract class ContaBancaria implements InterfaceContaBancaria {

	protected static final int AGENCIA_BANCO_VIDA_1 = 0001;
	
	protected static int DIGITO_DA_CONTA = 1;
	protected double VALOR_MINIMO_DE_DEPOSITO = 10.00;
	
	protected int agencia;
	protected int  digito;
	protected double saldo;
	
	
	protected Cliente titular;
	
	public ContaBancaria(Cliente titular) {
		this.agencia = ContaBancaria.AGENCIA_BANCO_VIDA_1;
		this.digito = DIGITO_DA_CONTA++;
		this.titular = titular;
	}
	
	// Metodo para depositar
	@Override
	public void depositar(double valorDoDeposito) {
		if (valorDoDeposito < VALOR_MINIMO_DE_DEPOSITO) {
			System.out.println("Deposito nåo realizado valor minimo: R$10.00");
		}
		this.saldo = saldo += valorDoDeposito;
	}

	// Metodo para sacar
	@Override
	public void sacar(double valorDoSaque) {
		if (saldo < valorDoSaque) {
			System.out.println("Saque nåo ralizado valor para saque menor ou igaual a: R$ " + saldo);
		}
		this.saldo = saldo -= valorDoSaque;
	}

	// Metodo transferencia
	@Override
	public void transfere(double valorDatransferencia, ContaBancaria contaDoDestinatario) {
		sacar(valorDatransferencia);
		contaDoDestinatario.depositar(valorDatransferencia);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getDigito() {
		return digito;
	}

	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.titular.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.digito));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
	
}
