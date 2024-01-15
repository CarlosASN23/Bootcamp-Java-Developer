package Banco.banco;

import java.util.ArrayList;
import java.util.List;

import Banco.contas.Conta;

public class Banco {
	
	protected String nome;
	protected int numeroInstituicao = 76;
	public List<Conta>contas;
	
	public Banco(Conta conta) {
		
		this.contas = (List<Conta>) conta;
		this.nome = "Free Money";
		this.numeroInstituicao = numeroInstituicao;
	}
	
	// Gerando getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroInstituicao() {
		return numeroInstituicao;
	}
	public void setNumeroInstituicao(int numeroInstituicao) {
		this.numeroInstituicao = numeroInstituicao;
	}

}
