/**
 * Classe Cliente - referente a criação do objeto cliente 
 * que será o proprietário da conta
 * @author Carlos Alberto SN
 * @since 15/01/2024
 */
package Banco.cliente;

public class Cliente {
	
	
	protected String nome;
	protected String cpf;
	protected String endereco;
	protected int anoNascimento;
	
	// Construtor sem passagem de parâmetros e valores Default
	public Cliente() {
		
		this.nome = "Manuel Oliveira";
		this.cpf = "876.331.332-22";
		this.endereco = "Rua dos Tapajos nº76, Valinhos - SP";
		this.anoNascimento = 1989;
		
	}
	
	//Construtor com passagem de parâmetros
	public Cliente(String nome, String cpf, String endereco, int anoNascimento) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.anoNascimento = anoNascimento;
	}

	// Gerando Getters e Setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	// Método responsavel por imprimir as informações do cliente
	public void InfosCliente() {
		
		System.out.println("==== Informações do Cliente ===="
						 + "\nNome: " + this.nome
						 + "\nCPF: " + this.cpf
						 + "\nEndereço: " + this.endereco
						 + "\nData Nascimento: " + this.anoNascimento);
	}


}
