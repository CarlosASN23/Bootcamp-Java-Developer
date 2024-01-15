/**
 * Class abstrata Contas que será herdada pelas classes ContaCorrente 
 * e ContaPoupanca
 * @author Carlos Alberto SN
 * @since 15/01/2024
 */

package Banco.contas;

import Banco.cliente.Cliente;

public abstract class Conta {
	
	// Inicialização das Variveis
	protected static  int SEQUENCIAL = 1;
	protected String agencia;
	protected String tipoConta;
	protected int numeroConta = SEQUENCIAL++;
	protected double saldo;
	protected String extrato="";
	protected Cliente cliente;
	
	
	// Construtor com passagem de parâmetro Cliente - Para criar uma conta
	// passa a ser necessário a criação de um objeto Cliente
	public Conta(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	// Construtor com passagem de parâmetro
	public Conta(String agencia, String tipoConta, int numeroConta, double saldo) {
		super();
		this.agencia = agencia;
		this.tipoConta = tipoConta;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}


	// Getters e Setters
	public String getAgencia() {
		return agencia;
	}


	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}


	public String getTipoConta() {
		return tipoConta;
	}


	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}


	public int getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}


	public double getSaldo() {
		return saldo;
	}
	// Fim dos Getters e Setters
	
	
	/**
	 * Métodos para a realização da operação de saque pelas contas
	 * 
	 * @param saque - corresponde ao valor que será sacado pelo usuário
	 * @parm saldo - corresponde ao valor disponivel na conta criada pelo usuário
	 * @return - irá retornar o valor final do saldo após a retirada (saque) do 
	 * valor desejado
	 */
	public double Sacar(double saque) {
		
		if(saque <= saldo) {
			
			saldo -= saque;
			extrato += ("\n(-)Saque R$"+saque);
			System.out.println("\nSaque realizado com sucesso"
					         + "\nValor sacado R$" + saque);
			return saldo;
			
		}else {
			System.out.println("Não foi possivel realizar o saque");
			return saldo;
		}
		
	}
	
	/**
	 * Métodos para a realização da operação de deposito pelas contas
	 * @param deposito - corresponde ao valor que será depositado pelo usuário
	 * @param saldo - corresponde ao valor disponivel na conta criada pelo usuário
	 * @return irá retornar o valor final do saldo após a entrada (deposito) do 
	 * valor desejado
	 */
	public double Depositar(double deposito) {
		
			
			if(deposito > 0) {
				
				saldo += deposito;
				extrato += ("\n(+)Deposito R$"+deposito);
				System.out.println("\nDeposito realizado com sucesso"
						          +"\nValor do deposito R$" + deposito);
				return saldo;
			}else {
				System.out.println("Valor inválido, tente novamente!");
				return saldo;
			}	
	}
	
	/**
	 * Método para a realização de transferências entre contaas
	 * @param saque - corresponde ao valor que sairá de uma conta (conta que esta fazendo a transferência)
	 * @param deposito - corresponde ao valor que entrará em outra conta
	 * @param contaDestino - corresponde a conta destino (que receberá o depósito)
	 * 
	 */
	public void Transferir(double saque,double deposito, Conta contaDestino) {
		
		this.Sacar(saque);
		contaDestino.Depositar(deposito);
		
	}
	
	// Método para a impressão das informações da conta
	public void InfoConta() {
		
		System.out.println( "==== Informações da Conta ====="
			  +"\nTitular da Conta: " + this.cliente.getNome() + " CPF: " + this.cliente.getCpf()
			  +"\nAgência: " + agencia
			  +"\nTipo Conta: " + tipoConta
			  +"\nNúmero Conta: " + numeroConta
			  +"\nSaldo R$"+saldo);
	}
	
	// Método para a impressão do Extrato de transações da conta
	public void Extrato() {
		
		System.out.println("\n=== Extrato ===="
		     + "\n"+extrato+"\n"
			 + "\nSaldo R$" + saldo);
	}
	

}
