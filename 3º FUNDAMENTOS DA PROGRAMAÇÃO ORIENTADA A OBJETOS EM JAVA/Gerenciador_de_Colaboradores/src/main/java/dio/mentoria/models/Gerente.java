package dio.mentoria.models;

import dio.mentoria.models.CalculaBonificacao;
import dio.mentoria.models.FuncionarioPJ;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao {
    private Double valorBonificacao;

    @Override
    public void calculaBonificacao(Double procentagemBonificacao) {
        this.valorBonificacao = (procentagemBonificacao/100)*getValorRemuneracao();

    }

    @Override
    public String toString() {
        return "Gerente - Funcionario Pessoa Juridica" +
                "\nNome: " + super.getNome() +
                "\nDocumento: " + super.getDocumento() +
                "\nEndereco: " + super.getEndereco() +
                "\nHoras Trabalhadas: " + super.getHorasTrabalhadas() +
                "\nValor Hora: R$" + super.getValorHora() +
                "\nValor Remuneracao: R$" + super.getValorRemuneracao() +
                "\nvalor Bonificação: R$" + String.format("%.2f",this.valorBonificacao) +
                '\n';
    }


}
