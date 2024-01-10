package Estabelecimento;

import Equipamentos.impressora.Impressora;
import Equipamentos.digitalizadora.Digitalizadora;
import Equipamentos.digitalizadora.Scanner;
import Equipamentos.copiadora.Fotocopiadora;
import Equipamentos.multifuncional.Multlaser;

public class Loja {
	
	public static void main(String[]args) {
		
		Multlaser em = new Multlaser();
		Scanner scan = new Scanner();
		
		Impressora impressora = em;
		Digitalizadora digitalizadora = scan;
		Fotocopiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
		
	}

}
