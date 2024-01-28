package dio.mentoria;

import dio.mentoria.models.Endereco;
import dio.mentoria.models.Gerente;
import dio.mentoria.models.OperadorDeCaixa;
import dio.mentoria.models.Vendedor;

public class main {

    public static void main(String[] args){

        Endereco end = new Endereco("Rua dos Tapajos","Casa","Vila Aparecida");
        Endereco end2 = new Endereco("Avenida Brasil", "Apartamento", "Alphaville - São Paulo");
        Vendedor vendedor1 = new Vendedor();
        vendedor1.setNome("Rogério Silva");
        vendedor1.setDocumento("88720-323");
        vendedor1.setEndereco(end);
        vendedor1.setValorSalario(7663.22);
        vendedor1.calculaBonificacao(10.0);
        System.out.printf(vendedor1.toString());

        OperadorDeCaixa oper1 = new OperadorDeCaixa("Geovana Martelli", "8778.223-33",663.22,end);
        System.out.println("\n"+oper1.toString());

        Gerente gerente = new Gerente();
        gerente.setNome("Alana Oliveira");
        gerente.setDocumento("776.223.222-33");
        gerente.setEndereco(end2);
        gerente.setValorHora(22.55);
        gerente.setHorasTrabalhadas(244);
        gerente.calcularRemuneracao();
        gerente.calculaBonificacao(15.0);
        System.out.println(gerente);
    }
}
