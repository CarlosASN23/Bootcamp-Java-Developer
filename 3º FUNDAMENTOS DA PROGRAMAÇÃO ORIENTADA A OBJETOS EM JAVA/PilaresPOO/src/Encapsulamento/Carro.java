package Encapsulamento;

import Herança.Veiculo;

public class Carro extends Veiculo {
	
	
	private static void confereCambio() {
		System.out.println("Confere câmbio em P");
	}
	private void confereCombustivel() {
		System.out.println("Confere combustivel");
	}
	public void ligar() {
		confereCambio();
		confereCombustivel();
		System.out.println("Ligando o carro");
	}

}
