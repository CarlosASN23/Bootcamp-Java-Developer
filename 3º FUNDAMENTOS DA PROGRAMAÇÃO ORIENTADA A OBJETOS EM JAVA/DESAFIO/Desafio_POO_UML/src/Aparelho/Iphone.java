/**
 * @author Carlos Alberto S. N
 * @since 10/01/2024
 * Criação da classe Aparelho Iphone
 * que implementará os métodos das interfaces
 * Navegador, Ipod e Telefone, contendo
 * as implementações dos métodos
 */
package Aparelho;

import Aparelho.contato.Telefone;
import Aparelho.internet.Navegador;
import Aparelho.musica.Ipod;

public class Iphone implements Navegador, Ipod, Telefone{

	@Override
	public void ligar() {
		System.out.println("Realizando ligação telefone...");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo Iphone...");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de voz Iphone...");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando musica no Iphone...");
		
	}

	@Override
	public void pausarMusica() {
		System.out.println("Pausando a musica no Iphone...");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando a musica no Iphone...");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo a pagina de navegação no Iphone...");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando uma nova aba de navegação no Iphone...");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina de navegação no Iphone...");
		
	}

}
