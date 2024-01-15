/**
 * Classe ContaCorrente que herda da classe Conta
 * @author Carlos Alberto SN
 * @since 15/01/2024
 */
package Banco.contas;

import Banco.cliente.Cliente;

public class ContaCorrente extends Conta {
	
	// Construtor com passagem de parâmetro da classe Pai
	public ContaCorrente(String agencia, String tipoConta, int numeroConta, double saldo) {
		super(agencia, tipoConta, numeroConta, saldo);
		
	}
	
	// Construtor com a passagem de parâmetro Cliente 
	public ContaCorrente(Cliente cliente) {
		
		super(cliente);
		this.agencia = "0001";
		this.tipoConta ="C/C - Conta Corrente";
	}
	
}
