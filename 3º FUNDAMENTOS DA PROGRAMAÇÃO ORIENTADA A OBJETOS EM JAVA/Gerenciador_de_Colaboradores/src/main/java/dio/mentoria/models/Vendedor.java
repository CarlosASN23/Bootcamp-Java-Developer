package dio.mentoria.models;

import dio.mentoria.models.CalculaBonificacao;
import dio.mentoria.models.FuncionarioCLT;

public class Vendedor extends FuncionarioCLT implements CalculaBonificacao {

    private Double valorBonificacao;

    @Override
    public void calculaBonificacao(Double procentagemBonificacao) {
        valorBonificacao = (procentagemBonificacao/100)*valorSalario;
    }

    @Override
    public String toString() {
        return "Vendedor:" +
                "\nNome: " + nome +
                "\nDocumento: " + documento+
                "\nValor Salario: R$" + valorSalario +
                "\nEndereco: " + endereco +
                "\nValor Bonificação: R$" + String.format("%.2f",valorBonificacao)+
                "\n";
    }


}
