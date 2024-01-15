/**
 * Classe ContaPoupanca que herda da classe Conta
 * @author Carlos Alberto SN
 * @since 15/01/2024
 */
package Banco.contas;

import Banco.cliente.Cliente;

public class ContaPoupanca extends Conta{
	
	// Construtor com passagem de parâmetro da classe Pai
	public ContaPoupanca(String agencia, String tipoConta, int numeroConta, double saldo) {
		super(agencia, tipoConta, numeroConta, saldo);
		
	}
	
	// Construtor com a passagem de parâmetro Cliente
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		this.agencia = "0003";
		this.tipoConta = "C/P - Conta Poupança";
	}

}
