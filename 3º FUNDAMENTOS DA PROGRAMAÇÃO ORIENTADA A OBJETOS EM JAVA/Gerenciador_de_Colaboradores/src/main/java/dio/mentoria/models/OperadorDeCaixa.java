package dio.mentoria.models;

import dio.mentoria.models.Endereco;
import dio.mentoria.models.FuncionarioCLT;

public class OperadorDeCaixa extends FuncionarioCLT {

    public OperadorDeCaixa(String nome, String documento, double valorSalario, Endereco endereco) {
        super(nome, documento, valorSalario, endereco);
    }

    @Override
    public String toString() {
        return "Operador De Caixa:" +
                "\nNome: " + nome +
                "\nDocumento: " + documento +
                "\nValor Salario: R$" + valorSalario +
                "\nEndereco: " + endereco +
                "\n";
    }
}
