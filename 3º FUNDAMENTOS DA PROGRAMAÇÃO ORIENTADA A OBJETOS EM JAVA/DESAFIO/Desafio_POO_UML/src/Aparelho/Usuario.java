/**
 * @author Carlos Alberto
 * @since 10/01/2024
 * 
 * Criação da classe main Usuario
 * para criação do objeto Iphone e sua 
 * execução de métodos
 */
package Aparelho;

public class Usuario {
	
	public static void main(String[]args) {
		
		// instanciação do objeto para a classe Iphone
		Iphone iph = new Iphone();
		
		// Chamamento dos métodos Iphone
		iph.adicionarNovaAba();
		iph.atender();
		iph.atualizarPagina();
		iph.exibirPagina();
		iph.iniciarCorreioVoz();
		iph.ligar();
		iph.pausarMusica();
		iph.selecionarMusica();
		iph.tocar();
	}

}
