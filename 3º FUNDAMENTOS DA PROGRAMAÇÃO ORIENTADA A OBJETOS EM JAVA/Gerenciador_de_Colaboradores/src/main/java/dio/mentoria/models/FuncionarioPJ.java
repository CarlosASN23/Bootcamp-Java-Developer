package dio.mentoria.models;

import dio.mentoria.models.Endereco;

public abstract class FuncionarioPJ {

    private String nome, documento;
    private Endereco endereco;
    private Integer horasTrabalhadas;
    private Double valorHora, valorRemuneracao;

    public FuncionarioPJ(String nome, String documento, Endereco endereco, Integer horasTrabalhadas, Double valorHora, Double valorRemuneracao) {
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
        this.valorRemuneracao = valorRemuneracao;
    }

    public FuncionarioPJ(){

    }

    public void calcularRemuneracao(){
        this.valorRemuneracao = this.valorHora * this.horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getValorRemuneracao() {
        return valorRemuneracao;
    }

    public void setValorRemuneracao(Double valorRemuneracao) {
        this.valorRemuneracao = valorRemuneracao;
    }

    @Override
    public String toString() {
        return "Funcionario Pessoa Juridica:" +
                "\nNome: " + nome +
                "\nDocumento: " + documento +
                "\nEndereco: " + endereco +
                "\nHoras Trabalhadas: " + horasTrabalhadas +
                "\nValor Hora: R$" + valorHora +
                "\nValor Remuneracao: R$" + String.format("%.2f",valorRemuneracao)+
                "\n";
    }
}
