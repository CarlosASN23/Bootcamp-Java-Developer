package Equipamentos.multifuncional;

import Equipamentos.copiadora.Fotocopiadora;
import Equipamentos.digitalizadora.Digitalizadora;
import Equipamentos.impressora.Impressora;

public class Multlaser implements Fotocopiadora, Digitalizadora, Impressora{

	@Override
	public void imprimir() {
		System.out.println("Imprimindo via equipamento Multifulcional...");
		
	}

	@Override
	public void digitalizar() {
		System.out.println("Digitalizando via equipamento Multifulcional...");
		
	}

	@Override
	public void copiar() {
		System.out.println("Copiando via equipamento Multifulcional...");
		
	}

}
