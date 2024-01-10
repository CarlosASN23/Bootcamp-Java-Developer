package Encapsulamento;

import Herança.Moto;
import Herança.Veiculo;

public class Autodromo {
	public static void maind(String[] args) {
		
		Carro jeep = new Carro();
		jeep.setChassi("877829");
		jeep.ligar();
		
		Moto z400 = new Moto();
		z400.setChassi("2232232");
		
		Veiculo coringa = jeep;
		coringa.ligar();
		
	}

}
