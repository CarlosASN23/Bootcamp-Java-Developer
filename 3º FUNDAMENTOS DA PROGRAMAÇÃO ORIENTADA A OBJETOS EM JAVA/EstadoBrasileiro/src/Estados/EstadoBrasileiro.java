package Estados;

//Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
public enum EstadoBrasileiro {
	SAO_PAULO ("SP","São Paulo",10),
	RIO_JANEIRO ("RJ", "Rio de Janeiro",11),
	PIAUI ("PI", "Piauí",12),
	MARANHAO ("MA","Maranhão",13),
	CEARA ("CE", "CEARÁ",14);
	
	private String nome;
	private String sigla;
	private int ibge;
	
	private EstadoBrasileiro(String nome, String sigla, int ibge) {
		this.nome = nome;
		this.sigla = sigla;
		this.ibge = ibge;
	}
	
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
	public int getIbge() {
		return ibge;
	}
	
}
