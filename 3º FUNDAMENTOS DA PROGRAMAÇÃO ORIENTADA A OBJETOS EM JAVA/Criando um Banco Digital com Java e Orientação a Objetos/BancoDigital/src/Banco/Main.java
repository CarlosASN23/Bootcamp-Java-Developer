package Banco;

import java.util.ArrayList;
import java.util.List;

import Banco.banco.Banco;
import Banco.cliente.Cliente;
import Banco.contas.ContaCorrente;
import Banco.contas.ContaPoupanca;

public class Main {
	
	public static void main(String[] args) {
		
		
		Cliente cliente = new Cliente();
		System.out.println("Informações do Cliente - Criado pelo método Default");
		cliente.InfosCliente();
		
		ContaCorrente cc = new ContaCorrente(cliente);
		System.out.println("\nInformações sobre a Conta do Cliente Criado");
		cc.InfoConta();
		
		System.out.println("\nDeposito em conta Corrente");
		cc.Depositar(300);
		
		System.out.println("\nImpressão do Extrato");
		cc.Extrato();
		
		
		ContaPoupanca cp = new ContaPoupanca(cliente);
		cp.Depositar(1000);
		cp.InfoConta();
		cp.Transferir(657, 657, cc);
		cp.Extrato();
		cc.Extrato();
		cp.InfoConta();
		cc.InfoConta();
		
		// Listando contas
		List conta = new ArrayList();
		conta.add(cc);
		conta.add(cp);
		System.out.println(conta);
	}

}
